const employee = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : 'Deepesh',
            age : 22
        },{
            name : 'DK',
            age : 22
        },{
            name : 'Deepu',
            age : 22
        }
    ])
    }else{
        reject('Failes')
    }
    })
    employee.then(function(data){
        console.log('Employee Data',data)
    }).catch(function(error){
    console.log('Failure Message',error)
    })
    