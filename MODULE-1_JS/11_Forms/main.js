document.getElementById("form").onsubmit = function(event){

    event.preventDefault();

    let name = this.elements["name"].value;

    if(name == ""){
        document.getElementById("error").innerHTML =
        "Name Required";
        return;
    }

    alert("Form Submitted");
};