let events = [
    {name:"Music", seats:10},
    {name:"Sports", seats:0}
];

events.forEach(function(event){

    if(event.seats > 0){
        document.getElementById("events").innerHTML +=
        event.name + "<br>";
    }

});

try{
    let seats = 5;

    if(seats <= 0){
        throw "No Seats Available";
    }

    console.log("Registered");
}
catch(error){
    console.log(error);
}