let events = [];

events.push("Music");
events.push("Workshop");
events.push("Music Night");

let music = events.filter(function(event){
    return event.includes("Music");
});

console.log(music);

let cards = events.map(function(event){
    return "Event: " + event;
});

console.log(cards);