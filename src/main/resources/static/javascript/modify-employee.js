// user task 5.2
class ModifyEmployee {

    employeeFormWithData(employee) {
        $("#employeeID").val(employee.id);
        $("#employeeFirstName").val(employee.firstName);
        $("#employeeLastname").val(employee.lastname);
        $("#dateOfBirth").val(employee.dateOfBirth);
        $("#phoneNumber").val(employee.phoneNumber);
        $("#email").val(employee.email);
    }

    getUrlElements() {
        return window.location.pathname + "/api"
    }

    async requestEmployeeDetails(url) {
        let response = await fetch(url)
        let employee = await response.json();

        this.employeeFormWithData(employee)

    }



}