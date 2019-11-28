// var brands = ['Kingfisher','Bisleri','Aqua','Kinley']
// console.log('For of Loop')
// for(var element of brands){
//     console.log('Brand = ',element)
// }
// console.log('============')
// var brands = ['Kingfisher','Bisleri','Aqua','Kinley']
// console.log('For in Loop')
// for(var element in brands){
//     console.log('Brand = ',brands[element])
// }
// console.log('============')
// console.log('For in Loop of Objects')
// var person = {
//     name : 'Deepesh',
//     age : 22,
//     color : 'white'
// }
// for (var key in person){
//     console.log('Value = ',person[key])
// }
// console.log('======================')
// var country = ['India','Brazil','America','Kenya']
// country.forEach(function(value,index){//Here we can give any parameter name
//     console.log('Country = ',value)
//     console.log('Country index = ',index)
// })
// console.log('======================')
// var list = [{
//     list : 'Watch',
//     id : 1,
//     price : 1200
// },
// {
//     list : 'Shoes',
//     id : 2,
//     price : 2200   
// },
// {
//     list : 'Shirt',
//     id : 3,
//     price : 1000
// },
// {
//     list : 'Jeans',
//     id : 4,
//     price : 1200
// }]
// list.forEach(function(list,index){//Here we can give any parameter name
//     console.log('List = ',list)
//     console.log('List index = ',index)
// })
// console.log('======================')
// var number = [10,20,30,40]
// number.forEach(function(value){
// console.log('For Each',value)
// })
// console.log('======================')
// number['hundred'] = 100;
// for(var i=0;i<number.length;i++){
//     console.log('For Loop ',number[i])
// }
// console.log('======================')
// for(var i in number){
//     console.log('For in loop ',number[i])
// }
// console.log('======================')
// var name;
// var name = "Azad"
// name = 'Airlift'

// //console.log('name1')
// let name1;
// //let name1 = 'Saaho'
// name1 = 'Valmiki'

// //const name2;
// const name2 = 'Dream Girl'
// //name2 = `Kabir Singh`
// console.log('======================')
for(let i = 0;i<5;i++){
    console.log('Inside for loop',i)
}
console.log('Outside for loop',i)
