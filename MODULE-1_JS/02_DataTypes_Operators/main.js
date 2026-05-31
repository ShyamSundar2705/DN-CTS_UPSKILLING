const eventName = "Music Show";
const eventDate = "10-08-2026";

let seats = 50;

seats--;

document.getElementById("demo").innerHTML =
`${eventName} - ${eventDate} - Seats Left: ${seats}`;