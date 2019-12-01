import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bikeschild',
  templateUrl: './bikeschild.component.html',
  styleUrls: ['./bikeschild.component.css']
})
export class BikeschildComponent implements OnInit {
  @Input() bike: { imgUrl: string, name: string};

  constructor() { }

  ngOnInit() {
  }

}
