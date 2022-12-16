// user task 1.1
class createShift {
    async postShiftDetails(url, htmlElement, event) {
        event.preventDefault()
        const formData = new FormData(htmlElement).entries();
        console.log("hej")
        let response = await fetch(url, {method: 'POST',
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(Object.fromEntries(formData))

        })
        let result = await response.json();
        console.log(result)
    }

}