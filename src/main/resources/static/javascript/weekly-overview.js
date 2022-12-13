class weeklyOverview {

    async requestWeeklyShift(url) {
        let response = await fetch(url);
        return  await response.json();
    }

    showShiftPerDay(data) {

        for (let i = 0; i < data.length; i++) {

            switch (data[i].day) {
                case "mandag":
                    let elementToAppendMonday = "<a href='#' class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
                    $("#monday").append(elementToAppendMonday);
                    break;
                case "tirsdag":
                    let elementToAppendTuesday = "<a href='#' class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
                    $("#tuesday").append(elementToAppendTuesday);
                    break;
                case "onsdag":
                    let elementToAppendWednesday = "<a href='#' class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
                    $("#wednesday").append(elementToAppendWednesday);
                    break;
                case "torsdag":
                    let elementToAppendThursday = "<a href='#' class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
                    $("#thursday").append(elementToAppendThursday);
                    break;
                case "fredag":
                    let elementToAppendFriday = "<a href='#' class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
                    $("#friday").append(elementToAppendFriday);
                    break;
            }

        }
    }



}