import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-help',
  templateUrl: './help.component.html',
  styleUrls: ['./help.component.css']
})
export class HelpComponent implements OnInit {
   Persons = [{
     name: 'DK',
     img: 'https://cdn.pixabay.com/photo/2019/09/10/15/10/dolomites-4466357__340.jpg',
     color: 'fair',
     height: '5.7'
   }, {
     name: 'Deepesh',
     img: 'https://cdn.pixabay.com/photo/2019/10/02/16/56/landscape-4521413__340.jpg',
     color: 'fair',
     height: '5.9'
   }, {
     name: 'Deepu',
     img: 'https://cdn.pixabay.com/photo/2019/10/01/12/24/path-4518094__340.jpg',
     color: 'fair',
     height: '5.8'
   }]
   Products = [{
    name: 'Pen',
    img: 'https://cdn.pixabay.com/photo/2019/09/10/15/10/dolomites-4466357__340.jpg',
    color: 'fair',
    height: '5.7'
  }, {
    name: 'Cream',
    img: 'https://cdn.pixabay.com/photo/2019/10/02/16/56/landscape-4521413__340.jpg',
    color: 'fair',
    height: '5.9'
  }, {
    name: 'Gel',
    img: 'https://cdn.pixabay.com/photo/2019/10/01/12/24/path-4518094__340.jpg',
    color: 'fair',
    height: '5.8'
  }]
  Pipes = [{
    name: 'Astral',
    img: 'https://cdn.pixabay.com/photo/2019/09/10/15/10/dolomites-4466357__340.jpg',
    color: 'fair',
    height: '5.7'
  }, {
    name: 'Cello',
    img: 'https://cdn.pixabay.com/photo/2019/10/02/16/56/landscape-4521413__340.jpg',
    color: 'fair',
    height: '5.9'
  }, {
    name: 'Birla',
    img: 'https://cdn.pixabay.com/photo/2019/10/01/12/24/path-4518094__340.jpg',
    color: 'fair',
    height: '5.8'
  }]
   color = 'blue';
   colorName = 'red';
   colorName1 = 'lightgray';
   isActive= false;
  constructor() {
   setInterval(() => {
     this.isActive=!this.isActive
   },2000)
   }

  ngOnInit() {
  }

}
