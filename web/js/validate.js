var data = null;

function loadJSONOptions(field, uri) {
    let refItem = document.getElementById(field);

    var dataRequest = new XMLHttpRequest();

    dataRequest.open('Get', uri, true);
    dataRequest.send();

    dataRequest.onload = function () {
        if (dataRequest.status == 200) {
            const data = JSON.parse(dataRequest.responseText);
            let option;

            for (let i = 0; i < data.length; i++) {
                option = document.createElement("option");
                option.text = data[i].title;
                option.value = data[i].id;
                refItem.add(option);
            }
        }
    }

    dataRequest.onerror = function () {
        alert("Some error has occurred - check network connection");
    }
}