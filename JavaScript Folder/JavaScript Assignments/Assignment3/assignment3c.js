//Array1
var fruits = ['Orange','Mango','Apple','Banana'];
                        
//Array2
var vegitable = ['Carrot','Onion','Ladyfinger','Patato'];
                
//Array3
var cartoon = ['PokeMon','DigiMon','MixMaster','IronMan'];
                
//Array4
var company = ['UST','Wipro','Infosys','Test Yantra'];

//Array5
var socialSite = ['Facebook','WhatsApp','Hike','Tweeter'];

//Array6
var color = ['Red','Blue','Yellow','Green'];

//Array7
var laptop = ['hp','Dell','Sony','Lenevo'];

//Array8
var country1 = ['India','Nepal','USA','UK'];

//Array9
var bird = ['Parrot','Crow','Pigeon','Peacock'];

//Array10
var tree = ['Banyan','Bamboo','Mango','Coconut'];
console.log('Using For in loop in Array');
//Array1
for(var i in fruits)
{
  console.log('Fruits = ',fruits[i]);
}
console.log('=============');
//Array2
for(var j in vegitable)
{
  console.log('Vegitable = ',vegitable[j]);
}
console.log('=============');
//Array3
for(var k in cartoon)
{
  console.log('Cartoon = ',cartoon[k]);
}
console.log('=============');
//Array4
for(var l in company)
{
  console.log('Company = ',company[l]);
}
console.log('=============');
//Array5
for(var m in socialSite)
{
  console.log('SocialSites = ',socialSite[m]);
}
console.log('=============');
//Array6
for(var n in color)
{
  console.log('Color = ',color[n]);
}
console.log('=============');
//Array7
for(var o in laptop)
{
  console.log('Laptop = ',laptop[o]);
}
console.log('=============');
//Array8
for(var p in country1)
{
  console.log('Country1 = ',country1[p]);
}
console.log('=============');
//Array9
for(var q in bird)
{
  console.log('Bird = ',bird[q]);
}
console.log('=============');
//Array10
for(var r in tree)
{
  console.log('Tree = ',tree[r]);
}
console.log('=============');
console.log('Using For in loop for Objects');
//Object1
var player = {
    name : 'Gautam Gambhir',
    age : 37,
    jersyno : 5,
  }
for (var key in player){
    console.log('Value = ',player[key])
}
console.log('=============');
//Object2
var train = {
    name : 'Gatiman',
    coaches : 12,
    number : 12215,
  }
for (var key in train){
    console.log('Value = ',train[key])
}
console.log('=============');
//Object3
var fan = {
    name : 'Orient',
    price : 7500,
    color : 'Grey',
  }
for (var key in fan){
    console.log('Value = ',fan[key])
}
console.log('=============');
//Object4
var shoes = {
    brand : 'Reebok',
    color : 'Black and Red',
    size : 9,
  }
for (var key in shoes){
    console.log('Value = ',shoes[key])
}
console.log('=============');
//Object5
var car = {
    name : 'Honda City',
    price : 1400000,
    color : 'Black',
  }
for (var key in car){
    console.log('Value = ',car[key])
}
console.log('=============');
//Object6
var flower = {
    name : 'Rose',
    color : 'Red',
  }
for (var key in flower){
    console.log('Value = ',flower[key])
}
console.log('=============');
//Object7
var country = {
    name : 'India',
    states : 29,
    flag : 'TriColor',
  }
for (var key in country){
    console.log('Value = ',country[key])
}
console.log('=============');
//Object8
var shirt = {
    name : 'PeterEngland',
    price : 1200,
    color : 'Blue',
  }
for (var key in shirt){
    console.log('Value = ',shirt[key])
}
console.log('=============');
//Object9
var mobile = {
    name : 'Galaxy S Duos 2',
    price : 10000,
    color : 'Black',
  }
for (var key in mobile){
    console.log('Value = ',mobile[key])
}
console.log('=============');
//Object10
var animal = {
    name : 'Lion',
    legs : 4,
    color : 'Yellow',
  }
for (var key in animal){
    console.log('Value = ',animal[key])
}
console.log('=============');