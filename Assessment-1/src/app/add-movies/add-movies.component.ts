import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movies',
  templateUrl: './add-movies.component.html',
  styleUrls: ['./add-movies.component.css']
})
export class AddMoviesComponent implements OnInit {

  form = new FormGroup({
    movie : new FormControl('', [Validators.required]),
    tittle : new FormControl('', [Validators.required]),
  });
  get movie() {
    return this.form.get('movie');
  }
  get tittle() {
    return this.form.get('tittle');
  }
  constructor() { }

  ngOnInit() {
  }
logInData(form) {
  console.log(form.value);
}
}
