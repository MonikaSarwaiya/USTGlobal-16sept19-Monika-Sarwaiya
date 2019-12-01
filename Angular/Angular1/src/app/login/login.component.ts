import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
showOrHide = false;
  constructor() { }

  ngOnInit() {
    setTimeout(() => {
      this.showOrHide = !this.showOrHide
    },2000)
  }

}
