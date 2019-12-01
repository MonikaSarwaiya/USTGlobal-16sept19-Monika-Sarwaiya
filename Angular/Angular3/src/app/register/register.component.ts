import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import {NgForm} from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
     Users;
     selectedUser;
     today = new Date();
  constructor(private service: UserService) {
    this.getData();
    console.log("Constructor is executed")
   }

  ngOnInit() {
    console.log("ngOnInIt is executed")
  }

  ngDoCheck() {
    console.log("ngDoCheck is executed")
  }

  ngAfterViewInit() {
    console.log('ngAfterViewInIt is executed')
  }

  ngAfterViewChecked() {
    console.log("ngAfterViewChecked is executed")
  }

  ngOnDestroy() {
    console.log("ngOnDestroy is executed")
  }

    logInData(form: NgForm) {
     console.log(form.value);
     this.service.postUser(form.value).subscribe(data => {
      console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('Data Hosted Successfully');
     });
    }
    getData() {
      this.service.getUsers().subscribe(data => {
        console.log(data);
        this.Users = data;
       }, err => {
         console.log(err);
       }, () => {
         console.log('Data got Successfully');
       });
    }
    deleteData(user) {
      console.log(user);
      this.service.deleteUser(user.id).subscribe(data => {
        console.log(data);
        this.getData();
      }, err => {
        console.log(err);
      }, () => {
        console.log('Data deleted Successfully');
      })
    }
    selectUser(user) {
      console.log(user);
      this.selectedUser = user;
    }
    updateData(form) {
      console.log(form.value);
      this.service.updateUser(form.value.id, form.value).subscribe(data => {
        console.log(data);
        this.getData();
      }, err => {
        console.log(err);
      }, () => {
        console.log('Data updated Successfully');
      })
    }
}
