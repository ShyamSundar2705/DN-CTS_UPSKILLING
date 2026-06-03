function sendData(){

    setTimeout(function(){

        fetch("https://jsonplaceholder.typicode.com/posts",{

            method:"POST",

            body:JSON.stringify({
                name:"John"
            })

        })

        .then(response => response.json())

        .then(data => {
            document.getElementById("msg").innerHTML =
            "Success";
        })

        .catch(error => {
            document.getElementById("msg").innerHTML =
            "Failed";
        });

    },2000);

}