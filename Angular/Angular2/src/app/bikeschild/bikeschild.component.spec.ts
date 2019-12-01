import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikeschildComponent } from './bikeschild.component';

describe('BikeschildComponent', () => {
  let component: BikeschildComponent;
  let fixture: ComponentFixture<BikeschildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikeschildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikeschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
