// user task 2.3
class DailyOverview {
    async requestDailyShifts(url) {
        let response = await fetch(url);
        let dailyShifts =  await response.json();

        this.showDailyShifts(dailyShifts)
    }

    showDailyShifts(data) {
        for (let i = 0; i < data.length; i++) {
            console.log(data[i].name)
            let id = data.ID
            let elementToAppend = '<div  class="employee-shift-daily-overview">' + data[i].name + '</div>';
            $("#daily-overview").append(elementToAppend);


        }
    }

    calculateHeight(hours, minutes) {
       let hoursToPixels = hours * 20
        let minutesToPixels = minutes * 0.3333

        return hoursToPixels + minutesToPixels
    }

}