class dailyOverview {

    async requestDailyShifts(url) {
        let response = await fetch(url);
        return  await response.json();
    }

    showDailyShifts(data) {
        for (let i = 0; i < data.length; i++) {



            console.log(data[i].name)
            let id = data.ID
            let height = this.calculateHeight(data.hours, data.minutes)

            let elementToAppend = '<div  class="employee-shift-daily-overview" id=${data.id}>" + data[i].name + "</div>';
            $("#daily-overview").append(elementToAppend);
            $("#placeholder").setAttribute("id", id);

            $('#' + id).style.height(height + 'px')
        }
    }

    calculateHeight(hours, minutes) {
       let hoursToPixels = hours * 20
        let minutesToPixels = minutes * 0.3333

        return hoursToPixels + minutesToPixels
    }

}