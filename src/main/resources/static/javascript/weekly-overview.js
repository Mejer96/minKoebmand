// user task 2.3
class weeklyOverview {

    async requestWeeklyShift(url) {
        let response = await fetch(url);
        let employees = await response.json();

        this.showShiftPerDay(employees)

    }

    showShiftPerDay(data) {

        for (let i = 0; i < data.length; i++) {

            switch (data[i].weekday) {
                case "mandag":
                    let elementToAppendMonday = "<a class='list-group-item'>" + data[i].firstname + " " + data[i].lastname + "</a>";
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