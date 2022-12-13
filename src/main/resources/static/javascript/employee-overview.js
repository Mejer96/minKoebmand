class EmployeeOverview {

    async requestAllEmployees(url) {
        let response = await fetch(url)
        return response.json();
    }

    showEmployees(data) {
        $("#content-div").append('<table id="table"></table>')
        $("#table").append('<thead id="thead"></thead>')
        $("#thead").append('<tr id="tr"></tr>')
        $("#tr").append('<th>Fornavn</th>\n' +
            '<th>Efternavn</th>\n' +
            '<th>Fødselsdato</th>\n' +
            '<th>Telefon</th>\n' +
            '<th>Email</th>\n' +
            '<th>Redigér</th>\n' +
            '<tr id="data-from-db"></tr>\n')

        for (let i = 0; i < data.length; i++) {
            let url = "http://localhost:8080/modify-employee/" + data.id

            $("#data-from-db").append('<td>' + data.firstName + '</td>\n' +
                '<td>' + data.lastname + '</td>\n' +
                '<td>' + data.dateOfBirth + '</td>\n' +
                '<td>' + data.phoneNumber + '</td>)\n' +
                '<td><a href="'+ url +'">Redigér</a></td>)\n')
        }
    }

    showModifyEmployeeForm() {

    }
}