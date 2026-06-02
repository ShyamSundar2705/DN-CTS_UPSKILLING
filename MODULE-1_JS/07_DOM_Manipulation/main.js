let container = document.querySelector("#container");

let card = document.createElement("div");

card.innerHTML = "Music Event";

container.appendChild(card);

function register(){
    card.innerHTML = "Registered Successfully";
}