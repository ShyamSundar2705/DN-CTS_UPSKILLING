function Event(name,seats){

    this.name = name;
    this.seats = seats;

}

Event.prototype.checkAvailability = function(){

    if(this.seats > 0)
        return "Available";
    else
        return "Full";

};

let e1 = new Event("Music",20);

console.log(e1.checkAvailability());

console.log(Object.entries(e1));