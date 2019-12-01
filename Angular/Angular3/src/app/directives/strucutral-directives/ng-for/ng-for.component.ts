import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [
    {
     img : 'https://cdn.pixabay.com/photo/2017/05/07/19/32/strawberry-2293337__340.jpg',
     name : 'Strawberry' ,
     price: 500
  },
  {
    img : 'https://cdn.pixabay.com/photo/2016/07/04/07/18/currant-1496075__340.jpg',
    name : 'Currant Berries Bunch' ,
    price: 600
 },
 {
  img : 'https://cdn.pixabay.com/photo/2017/01/20/15/06/orange-1995056__340.jpg',
  name : 'Oranges' ,
  price: 200
},
];
  constructor() { }

  ngOnInit() {
  }

}
