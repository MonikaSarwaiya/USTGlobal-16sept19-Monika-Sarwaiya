import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-carschild',
  templateUrl: './carschild.component.html',
  styleUrls: ['./carschild.component.css']
})
export class CarschildComponent implements OnInit {
  @Input() car: { imgUrl: string, name: string};

  constructor() { }

  ngOnInit() {
  }

}
