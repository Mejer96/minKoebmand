// user task 2.3
class WeeklyOverview {


    showShiftPerDay(data) {
        const href = "/daily-overview/"
        for (let i = 0; i < data.length; i++) {

            switch (data[i].weekDay) {
                case "Monday":
                    let elementToAppendMonday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#monday").append(elementToAppendMonday)
                    break;
                case "Tuesday":
                    let elementToAppendTuesday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#tuesday").append(elementToAppendTuesday)
                    break;
                case "Wednesday":
                    let elementToAppendWednesday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#wednesday").append(elementToAppendWednesday)
                    break;
                case "Thursday":
                    let elementToAppendThursday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#thursday").append(elementToAppendThursday)
                    break;
                case "Friday":
                    let elementToAppendFriday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#friday").append(elementToAppendFriday)
                    break;
                case "Saturday":
                    let elementToAppendSaturday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#saturday").append(elementToAppendSaturday)
                    break;
                case "Sunday":
                    let elementToAppendSunday = "<a class='list-group-item'>" + data[i].employee.firstName + " " + data[i].employee.lastname + "</a>";
                    $("#sunday").append(elementToAppendSunday)
                    break;
            }
        }
    }
}