//Array1
const fruits = ['Orange','Mango','Apple','Banana'];
                        
//Array2
const vegitable = ['Carrot','Onion','Ladyfinger','Patato'];
                
//Array3
const cartoon = ['PokeMon','DigiMon','MixMaster','IronMan'];
                
//Array4
const company = ['UST','Wipro','Infosys','Test Yantra'];

//Array5
const socialSite = ['Facebook','WhatsApp','Hike','Tweeter'];

//Array6
const color = ['Red','Blue','Yellow','Green'];

//Array7
const laptop = ['hp','Dell','Sony','Lenevo'];

//Array8
const country1 = ['India','Nepal','USA','UK'];

//Array9
const bird = ['Parrot','Crow','Pigeon','Peacock'];

//Array10
const tree = ['Banyan','Bamboo','Mango','Coconut'];
//Using Array Property
//Array1
console.log('Length of Fruits ',fruits.length)
console.log('=============');
//Array2
console.log('Length of Vegitable ',vegitable.length)
console.log('=============');
//Array3
console.log('Length of Color ',color.length)
console.log('=============');
//Array4
console.log('Length of Company ',company.length)
console.log('=============');
//Array5
console.log('Length of Cartoon ',cartoon.length)
console.log('=============');
//Array6
console.log('Length of SocialSite ',socialSite.length)
console.log('=============');
//Array7
console.log('Length of Laptop ',laptop.length)
console.log('=============');
//Array8
console.log('Length of Country ',country1.length)
console.log('=============');
//Array9
console.log('Length of Bird ',bird.length)
console.log('=============');
//Array10
console.log('Length of Tree ',tree.length)
console.log('=============');
//Using methods of Array
console.log('Using For Each Method');
//Array1
fruits.forEach(function(value,index){
    console.log('Value ',value);
    console.log('Index ',index);
})
console.log('=============');
//Array2
vegitable.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array3
cartoon.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array4
company.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array5
socialSite.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array6
color.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array7
laptop.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array8
country1.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array9
bird.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array10
tree.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
console.log('Using isArray Method')
//Array1
const fruitsArrayOrNot = Array.isArray(fruits);
console.log('Fruits is Array or not ',fruitsArrayOrNot);
console.log('=============');
//Array2
const vegitableArrayOrNot = Array.isArray(vegitable);
console.log('Vegitable is Array or not ',vegitableArrayOrNot);
console.log('=============');
//Array3
const companyArrayOrNot = Array.isArray(company);
console.log('Company is Array or not ',companyArrayOrNot);
console.log('=============');
//Array4
const cartoonArrayOrNot = Array.isArray(cartoon);
console.log('Cartoon is Array or not ',cartoonArrayOrNot);
console.log('=============');
//Array5
const colorArrayOrNot = Array.isArray(color);
console.log('Color is Array or not ',colorArrayOrNot);
console.log('=============');
//Array6
const socialSiteArrayOrNot = Array.isArray(socialSite);
console.log('SocialSite is Array or not ',socialSiteArrayOrNot);
console.log('=============');
//Array7
const laptopArrayOrNot = Array.isArray(laptop);
console.log('Laptop is Array or not ',laptopArrayOrNot);
console.log('=============');
//Array8
const countryArrayOrNot = Array.isArray(country1);
console.log('Fruits is Array or not ',fruitsArrayOrNot);
console.log('=============');
//Array9
const birdArrayOrNot = Array.isArray(bird);
console.log('Bird is Array or not ',birdArrayOrNot);
console.log('=============');
//Array10
const treeArrayOrNot = Array.isArray(tree);
console.log('Tree is Array or not ',treeArrayOrNot);
console.log('=============');
const str = 'Deepesh'
const str1 = Array.isArray(str);
console.log('Array or not',str1);
console.log('=============');
console.log('Using includes Method');
//Array1
const hasBanana = fruits.includes('Banana');
console.log('Has Banana ',hasBanana);
console.log('=============');
//Array2
const hasCarrot = vegitable.includes('Carrot',2);
console.log('Has Carrot ',hasCarrot);
console.log('=============');
//Array3
const hasCartoon = cartoon.includes('MixMaster',2);
console.log('Has Cartoon ',hasCartoon);
console.log('=============');
//Array4
const hasCompany = company.includes('MicroSoft',3);
console.log('Has Company ',hasCompany);
console.log('=============');
//Array5
const hasColor = color.includes('Pink');
console.log('Has Color ',hasColor);
console.log('=============');
//Array6
const hasSocialSite = socialSite.includes('Instagram',1);
console.log('Has SocialSite ',hasSocialSite);
console.log('=============');
//Array7
const hasLaptop = laptop.includes('Lenevo');
console.log('Has Laptop ',hasLaptop);
console.log('=============');
//Array8
const hasCountry = country1.includes('India',0);
console.log('Has Country ',hasCountry);
console.log('=============');
//Array9
const hasBird = bird.includes('Peacock',2);
console.log('Has Bird ',hasBird);
console.log('=============');
//Array10
const hasTree = tree.includes('Banyan');
console.log('Has Tree ',hasTree);
console.log('=============');
console.log('Using Push Method');
//Array1
fruits.push('Grapes','Pinaapple')
console.log('After push method ',fruits)
console.log('=============');
//Array2
vegitable.push('Tomato','Chilly')
console.log('After push method ',vegitable)
console.log('=============');
//Array3
cartoon.push('Ninja Hatori','PerMan')
console.log('After push method ',cartoon)
console.log('=============');
//Array4
company.push('Google','MicroSoft')
console.log('After push method ',company)
console.log('=============');
//Array5
color.push('Gray','Pink')
console.log('After push method ',color)
console.log('=============');
//Array6
socialSite.push('Telegram','Instagram')
console.log('After push method ',socialSite)
console.log('=============');
//Array7
laptop.push('Samsung','Asus')
console.log('After push method ',laptop)
console.log('=============');
//Array8
country1.push('Ireland','Iceland')
console.log('After push method ',country1)
console.log('=============');
//Array9
bird.push('Egal','Orchird')
console.log('After push method ',bird)
console.log('=============');
//Array10
tree.push('Ficus religiosa','Saraca asoca ')
console.log('After push method ',fruits)
console.log('=============');
console.log('Using pop Method')
//Array1
fruits.pop();
console.log('After pop method ',fruits)
console.log('=============');
//Array2
vegitable.pop();
console.log('After pop method ',vegitable)
console.log('=============');
//Array3
company.pop();
console.log('After pop method ',company)
console.log('=============');
//Array4
color.pop();
console.log('After pop method ',color)
console.log('=============');
//Array5
socialSite.pop();
console.log('After pop method ',socialSite)
console.log('=============');
//Array6
cartoon.pop();
console.log('After pop method ',cartoon)
console.log('=============');
//Array7
laptop.pop();
console.log('After pop method ',laptop)
console.log('=============');
//Array8
country1.pop();
console.log('After pop method ',country1)
console.log('=============');
//Array9
bird.pop();
console.log('After pop method ',bird)
console.log('=============');
//Array10
tree.pop();
console.log('After pop method ',tree)
console.log('=============');
console.log('Using Unshift Method');
//Array1
fruits.unshift('Gavava','Pinaapple')
console.log('After unshift method ',fruits)
console.log('=============');
//Array2
vegitable.unshift('Radish','Chilly')
console.log('After unshift method ',vegitable)
console.log('=============');
//Array3
cartoon.unshift('Power Ranger','PerMan')
console.log('After unshift method ',cartoon)
console.log('=============');
//Array4
company.unshift('Thomson Ruters','MicroSoft')
console.log('After unshift method ',company)
console.log('=============');
//Array5
color.unshift('Gold','Pink')
console.log('After unshift method ',color)
console.log('=============');
//Array6
socialSite.unshift('Linkedin','Instagram')
console.log('After unshift method ',socialSite)
console.log('=============');
//Array7
laptop.unshift('Huwai','Asus')
console.log('After unshift method ',laptop)
console.log('=============');
//Array8
country1.unshift('Scotland','Iceland')
console.log('After unshift method ',country1)
console.log('=============');
//Array9
bird.unshift('Cuckoo','Orchird')
console.log('After unshift method ',bird)
console.log('=============');
//Array10
tree.unshift('Azadirachta indica','Saraca asoca ')
console.log('After unshift method ',tree)
console.log('=============');
console.log('Using pop Method')
//Array1
fruits.shift();
console.log('After shift method ',fruits)
console.log('=============');
//Array2
vegitable.shift();
console.log('After shift method ',vegitable)
console.log('=============');
//Array3
company.shift();
console.log('After shift method ',company)
console.log('=============');
//Array4
color.shift();
console.log('After shift method ',color)
console.log('=============');
//Array5
socialSite.shift();
console.log('After shift method ',socialSite)
console.log('=============');
//Array6
cartoon.shift();
console.log('After shift method ',cartoon)
console.log('=============');
//Array7
laptop.shift();
console.log('After shift method ',laptop)
console.log('=============');
//Array8
country1.shift();
console.log('After shift method ',country1)
console.log('=============');
//Array9
bird.shift();
console.log('After shift method ',bird)
console.log('=============');
//Array10
tree.shift();
console.log('After shift method ',tree)
console.log('=============');
console.log('Using Splice Method')
//Array1
fruits.splice(1,2,'Apricots','Avocado');
console.log('After splice method ',fruits)
console.log('=============');
//Array2
vegitable.splice(1,2,'Cabbage','Turnip');
console.log('After splice method ',vegitable)
console.log('=============');
//Array3
company.splice(1,2);
console.log('After splice method ',company)
console.log('=============');
//Array4
color.splice(2,4,'Gold','Black');
console.log('After splice method ',color)
console.log('=============');
//Array5
socialSite.splice(2,4);
console.log('After splice method ',socialSite)
console.log('=============');
//Array6
cartoon.splice(1,3,'Power Ranger');
console.log('After splice method ',cartoon)
console.log('=============');
//Array7
laptop.splice(0,1);
console.log('After splice method ',laptop)
console.log('=============');
//Array8
country1.splice(0,2,'China','Swezerland');
console.log('After splice method ',country1)
console.log('=============');
//Array9
bird.splice(1,4,'Dove');
console.log('After splice method ',bird)
console.log('=============');
//Array10
tree.splice(0,3);
console.log('After splice method ',tree)
console.log('=============');
console.log('Using Slice Method')
//Array1
const afterSlice = fruits.slice(2,4)
console.log('After Slice Method ',fruits)
console.log('After Slice Method ',afterSlice)
console.log('=============');
//Array2
const afterSlice1 = vegitable.slice(2,4)
console.log('After Slice Method ',vegitable)
console.log('After Slice Method ',afterSlice1)
console.log('=============');
//Array3
const afterSlice2 = company.slice(1,4)
console.log('After Slice Method ',company)
console.log('After Slice Method ',afterSlice2)
console.log('=============');
//Array4
const afterSlice3 = socialSite.slice(1,2)
console.log('After Slice Method ',socialSite)
console.log('After Slice Method ',afterSlice3)
console.log('=============');
//Array5
const afterSlice4 = color.slice(0,4)
console.log('After Slice Method ',color)
console.log('After Slice Method ',afterSlice4)
console.log('=============');
//Array6
const afterSlice5 = country1.slice(0,3)
console.log('After Slice Method ',country1)
console.log('After Slice Method ',afterSlice5)
console.log('=============');
//Array7
const afterSlice6 = laptop.slice(0,2)
console.log('After Slice Method ',laptop)
console.log('After Slice Method ',afterSlice6)
console.log('=============');
//Array8
const afterSlice7 = cartoon.slice(1,4)
console.log('After Slice Method ',cartoon)
console.log('After Slice Method ',afterSlice7)
console.log('=============');
//Array9
const afterSlice8 = bird.slice(1,2)
console.log('After Slice Method ',bird)
console.log('After Slice Method ',afterSlice8)
console.log('=============');
//Array10
const afterSlice9 = tree.slice(1,1)
console.log('After Slice Method ',tree)
console.log('After Slice Method ',afterSlice9)
console.log('=============');
console.log('Using indexOf Method')
//Array1
const indexOfBanana = fruits.indexOf('Banana',2)
console.log('Index of Banana',indexOfBanana)
console.log('=============');
//Array2
const indexOfPatato = vegitable.indexOf('Patato',3)
console.log('Index of Patato',indexOfPatato)
console.log('=============');
//Array3
const indexOfInfosys = company.indexOf('Infosys',1)
console.log('Index of Infosys',indexOfInfosys)
console.log('=============');
//Array4
const indexOfPink = color.indexOf('Pink',3)
console.log('Index of Pink',indexOfPink)
const indexOfPink1 = color.indexOf('Pink')
console.log('Index of Pink',indexOfPink1)
console.log('=============');
//Array5
const indexOfNepal = country1.indexOf('Nepal',1)
console.log('Index of Nepal',indexOfNepal)
console.log('=============');
//Array6
const indexOfInsta = socialSite.indexOf('Instagram')
console.log('Index of Insta',indexOfInsta)
console.log('=============');
//Array7
const indexOfDell = laptop.indexOf('Dell',1)
console.log('Index of Dell',indexOfDell)
console.log('=============');
//Array8
const indexOfMixMaster = cartoon.indexOf('MixMaster',2)
console.log('Index of MixMaster',indexOfMixMaster)
console.log('=============');
//Array9
const indexOfEgal = bird.indexOf('Egal')
console.log('Index of Egal',indexOfEgal)
console.log('=============');
//Array10
const indexOfCoconut = tree.indexOf('Coconut',1)
console.log('Index of Coconut',indexOfCoconut)
console.log('=============');
console.log('Using Join Method')
//Array1
const stringFruits = fruits.join('-')
console.log('String Fruits',stringFruits)
console.log('=============');
//Array2
const stringVegitable = vegitable.join('!')
console.log('String Vegitable',stringVegitable)
console.log('=============');
//Array3
const stringCompany = company.join('@')
console.log('String Company',stringCompany)
console.log('=============');
//Array4
const stringCartoon = cartoon.join()
console.log('String Cartoon',stringCartoon)
console.log('=============');
//Array5
const stringSocialSite = socialSite.join('#')
console.log('String SocialSite',stringSocialSite)
console.log('=============');
//Array6
const stringColor = color.join('$')
console.log('String Color',stringColor)
console.log('=============');
//Array7
const stringLaptop = laptop.join('%')
console.log('String Laptop',stringLaptop)
console.log('=============');
//Array8
const stringCountry = country1.join('&')
console.log('String Country',stringCountry)
console.log('=============');
//Array9
const stringBird = bird.join('*')
console.log('String Bird',stringBird)
console.log('=============');
//Array10
const stringTree = tree.join('/')
console.log('String Tree',stringTree)
console.log('=============');
console.log('Using Map Method')
//Array1
const number = [100,200,300,400]
const num = number.map(function(value,index){
    let newValue = value + 100;
    return newValue
})
console.log('After Map Method ',num)
//Fat Arrow Function
const num1 = number.map(value => value + 100);
console.log('After Fat Arrow in Map Method ',num1)
console.log('=============');
//Array2
const number1 = [1000,2000,3000,4000]
const num2 = number1.map(function(value,index){
    let newValue = value * 100;
    return newValue
})
console.log('After Map Method ',num2)
//Fat Arrow Function
const num3 = number1.map(value => value * 100);
console.log('After Fat Arrow in Map Method ',num3)
console.log('=============');
//Array3
const number2 = [10,20,30,40]
const num4 = number.map(function(value,index){
    let newValue = value + 1000;
    return newValue
})
console.log('After Map Method ',num4)
//Fat Arrow Function
const num5 = number.map(value => value + 1000);
console.log('After Fat Arrow in Map Method ',num5)
console.log('=============');
//Array4
const number3 = [500,400,300,800]
const num6 = number.map(function(value,index){
    let newValue = value / 100;
    return newValue
})
console.log('After Map Method ',num6)
//Fat Arrow Function
const num7 = number.map(value => value / 100);
console.log('After Fat Arrow in Map Method ',num7)
console.log('=============');
//Array5
const number4 = [400,200,50,900]
const num8 = number.map(function(value,index){
    let newValue = value * 101;
    return newValue
})
console.log('After Map Method ',num8)
//Fat Arrow Function
const num9 = number.map(value => value * 101);
console.log('After Fat Arrow in Map Method ',num9)
console.log('=============');
//Array6
const number5 = [100,200,300,400]
const num10 = number.map(function(value,index){
    let newValue = value % 10;
    return newValue
})
console.log('After Map Method ',num10)
//Fat Arrow Function
const num11 = number.map(value => value % 10);
console.log('After Fat Arrow in Map Method ',num11)
console.log('=============');
//Array7
const number6 = [900,200,600,400]
const num12 = number.map(function(value,index){
    let newValue = value - 100;
    return newValue
})
console.log('After Map Method ',num12)
//Fat Arrow Function
const num13 = number.map(value => value - 100);
console.log('After Fat Arrow in Map Method ',num13)
console.log('=============');
//Array8
const number7 = [480,200,700,400]
const num14 = number.map(function(value,index){
    let newValue = value + 500;
    return newValue
})
console.log('After Map Method ',num14)
//Fat Arrow Function
const num15 = number.map(value => value + 500);
console.log('After Fat Arrow in Map Method ',num15)
console.log('=============');
//Array9
const number8 = [800,200,300,400]
const num16 = number.map(function(value,index){
    let newValue = value * 50;
    return newValue
})
console.log('After Map Method ',num16)
//Fat Arrow Function
const num17 = number.map(value => value * 50);
console.log('After Fat Arrow in Map Method ',num17)
console.log('=============');
//Array10
const number9 = [10000,20000,30000,40000]
const num18 = number.map(function(value,index){
    let newValue = value / 100;
    return newValue
})
console.log('After Map Method ',num18)
//Fat Arrow Function
const num19 = number.map(value => value / 100);
console.log('After Fat Arrow in Map Method ',num19)
console.log('=============');
console.log('Using Filter Method')
//Array1
const a = number.filter(function(value,index){
    if(value>200)
    return true;
    else
    return false;
})
console.log('After Filter Method ',a)
//Fat Arrow Function
const b = number.filter(value => value > 200);
console.log('After Fat Arrow in Filter Method ',b)
console.log('=============');
//Array2
const c = number1.filter(function(value,index){
    if(value < 3000)
    return true;
    else
    return false;
})
console.log('After Filter Method ',c)
//Fat Arrow Function
const d = number1.filter(value => value < 3000);
console.log('After Fat Arrow in Filter Method ',d)
console.log('=============');
//Array3
const e = number2.filter(function(value,index){
    if(value > 100)
    return true;
    else
    return false;
})
console.log('After Filter Method ',e)
//Fat Arrow Function
const f = number2.filter(value => value > 100);
console.log('After Fat Arrow in Filter Method ',f)
console.log('=============');
//Array4
const g = number3.filter(function(value,index){
    if(value > 500)
    return true;
    else
    return false;
})
console.log('After Filter Method ',g)
//Fat Arrow Function
const h = number3.filter(value => value > 500);
console.log('After Fat Arrow in Filter Method ',h)
console.log('=============');
//Array5
const i = number4.filter(function(value,index){
    if(value > 300)
    return true;
    else
    return false;
})
console.log('After Filter Method ',i)
//Fat Arrow Function
const j = number4.filter(value => value > 300);
console.log('After Fat Arrow in Filter Method ',j)
console.log('=============');
//Array6
const k = number5.filter(function(value,index){
    if(value < 100)
    return true;
    else
    return false;
})
console.log('After Filter Method ',k)
//Fat Arrow Function
const l = number5.filter(value => value < 100);
console.log('After Fat Arrow in Filter Method ',l)
console.log('=============');
//Array7
const m = number6.filter(function(value,index){
    if(value > 800)
    return true;
    else
    return false;
})
console.log('After Filter Method ',m)
//Fat Arrow Function
const n = number6.filter(value => value > 800);
console.log('After Fat Arrow in Filter Method ',n)
console.log('=============');
//Array8
const o = number7.filter(function(value,index){
    if(value = 500)
    return true;
    else
    return false;
})
console.log('After Filter Method ',o)
//Fat Arrow Function
const p = number7.filter(value => value = 500);
console.log('After Fat Arrow in Filter Method ',p)
console.log('=============');
//Array9
const q = number8.filter(function(value,index){
    if(value != 200)
    return true;
    else
    return false;
})
console.log('After Filter Method ',q)
//Fat Arrow Function
const r = number8.filter(value => value != 200);
console.log('After Fat Arrow in Filter Method ',r)
console.log('=============');
//Array10
const s = number9.filter(function(value,index){
    if(value < 35000)
    return true;
    else
    return false;
})
console.log('After Filter Method ',s)
//Fat Arrow Function
const t = number9.filter(value => value < 35000);
console.log('After Fat Arrow in Filter Method ',t)
console.log('=============');