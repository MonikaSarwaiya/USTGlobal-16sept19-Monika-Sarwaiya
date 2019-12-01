import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
selectedCar;
Cars = [{
      name: 'Sports Car',
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg'
}, {
  name: 'BMW',
  imgUrl: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg'
}, {
  name: 'Audi',
      imgUrl: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg'
}, {
  name: 'Mercedes',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg'
}]
  constructor() { }

  ngOnInit() {
  }
     sendCar(car) {
       console.log(car)
       this.selectedCar=car;
     }
}
