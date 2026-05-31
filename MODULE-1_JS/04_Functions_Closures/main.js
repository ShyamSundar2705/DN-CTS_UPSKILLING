function addEvent(name){
    console.log(name + " Added");
}

function registerUser(name){
    console.log(name + " Registered");
}

function filterEventsByCategory(callback){
    callback();
}

function registrationCounter(){

    let count = 0;

    return function(){
        count++;
        console.log("Total Registrations: " + count);
    }

}

let counter = registrationCounter();

counter();
counter();

filterEventsByCategory(function(){
    console.log("Music Events");
});