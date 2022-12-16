// user task 5.2
class EmployeeOverview {

    async requestAllEmployees(url) {
        let response = await fetch(url)
        let employees =  await response.json()
        this.showEmployees(employees)
    }



    showEmployees(employees) {
        $("#content-div").append('<table id="table"></table>')
        $("#table").append('<thead id="thead"></thead>')
        $("#thead").append('<tr id="tr"></tr>')
        $("#tr").append('<th>Fornavn</th><th>Efternavn</th><th>Fødselsdato</th><th>Telefon</th><th>Email</th><th>Rediger</th>')

        for (let i = 0; i < employees.length; i++) {
            let url = "http://localhost:8080/show-employee/" + employees[i].id
            $("#tr").after('<tr><td>'+ employees[i].firstName +'</td><td>'+ employees[i].lastname +'</td><td>'+ employees[i].dateOfBirth +'</td><td>'+ employees[i].phoneNumber +'</td><td>'+ employees[i].email +'</td><td><a href="'+ url + '">Rediger</a></td></tr>')
        }
    }
}