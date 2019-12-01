import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarschildComponent } from './carschild.component';

describe('CarschildComponent', () => {
  let component: CarschildComponent;
  let fixture: ComponentFixture<CarschildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarschildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
