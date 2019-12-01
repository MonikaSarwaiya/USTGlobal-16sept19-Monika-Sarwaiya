import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name : string = 'Deepesh';
  imgUrl : string = 'https://cdn.pixabay.com/photo/2018/02/07/16/59/tree-3137482__340.jpg';
  address : string = 'Rajeev Colony Nagda 456335';
  colorName : string = 'aqua';
  isActive : boolean = false;
  colSpanValue : number = 2;
  constructor() { }

  ngOnInit() {
     setInterval(() => {
       this.colorName = 'red',
       this.isActive = !this.isActive
     }, 2000);
  }
}
