function showEvent(name = "Music"){
    console.log(name);
}

showEvent();

const event = {
    name:"Workshop",
    date:"10-08-2026"
};

const {name,date} = event;

console.log(name);
console.log(date);

const events = ["Music","Sports"];

const copiedEvents = [...events];

console.log(copiedEvents);