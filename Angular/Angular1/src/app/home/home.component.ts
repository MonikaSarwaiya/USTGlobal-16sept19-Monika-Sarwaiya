import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
name: string = 'Deepesh';
imgUrl: string = 'https://cdn.pixabay.com/photo/2019/09/28/20/21/trees-4511721__340.jpg';
address: string = 'Rajeev Colony Nagda-456335';
colorName: string = 'red';
isActive: boolean = false;
colSpanValue = 2;
color = 'orange'
InputData = '';
  constructor() {
    setInterval(() => {
      this.colorName = 'aqua'
      this.isActive = !this.isActive
    },2000)
   }
   printAlertMsg() {
     alert("Hi Dk Welcome to Angular")
   }
   inputData(event) {
     console.log(event.target.value)
     this.InputData = event.target.value
   }
  ngOnInit() {
  }


}
