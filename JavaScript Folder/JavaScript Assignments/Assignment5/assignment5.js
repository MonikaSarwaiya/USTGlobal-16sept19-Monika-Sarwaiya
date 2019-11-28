function useFunction(){
    let a = document.getElementById('psw')
    if(a.type === 'password'){
        a.type = 'text'
    }
    else{
        a.type = 'password'
    }
}
