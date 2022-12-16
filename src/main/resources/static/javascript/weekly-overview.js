// user task 2.3
class WeeklyOverview {


    showWeekDays(data) {


        $("#weekly-overview").append('<div id="monday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="tuesday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="wednesday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="thursday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="friday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="saturday" class="div-daily-info-weekly-overview"></div>' +
        '<div id="sunday" class="div-daily-info-weekly-overview"></div>')

        $("#monday").setAttribute("href", )

    }


    showShiftPerDay(data) {
        console.log(data)
        for (let i = 0; i < data.length; i++) {

            switch (data[i].weekDay) {
                case "Monday":
                    let elementToAppendMonday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#monday").append(elementToAppendMonday);
                    break;
                case "Tuesday":
                    let elementToAppendTuesday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#tuesday").append(elementToAppendTuesday);
                    break;
                case "Wednesday":
                    let elementToAppendWednesday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#wednesday").append(elementToAppendWednesday);
                    break;
                case "Thursday":
                    let elementToAppendThursday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#thursday").append(elementToAppendThursday);
                    break;
                case "Friday":
                    let elementToAppendFriday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#friday").append(elementToAppendFriday);
                    break;
            }
        }
    }
}