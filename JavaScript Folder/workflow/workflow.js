function first(callfunc){
    setTimeout( function(){
console.log('First Function executed')
callfunc();
},0)

//console.log('Executed');
}

function second(){
    console.log('Second Function executed');
    }

    first(second);
    