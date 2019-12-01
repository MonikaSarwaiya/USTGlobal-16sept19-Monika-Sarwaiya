import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptopschild',
  templateUrl: './laptopschild.component.html',
  styleUrls: ['./laptopschild.component.css']
})
export class LaptopschildComponent implements OnInit {
  @Input() laptop: { imgUrl: string, name: string};

  constructor() { }

  ngOnInit() {
  }

}
