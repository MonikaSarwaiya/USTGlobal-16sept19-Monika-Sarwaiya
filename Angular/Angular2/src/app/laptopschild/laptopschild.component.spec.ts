import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopschildComponent } from './laptopschild.component';

describe('LaptopschildComponent', () => {
  let component: LaptopschildComponent;
  let fixture: ComponentFixture<LaptopschildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaptopschildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaptopschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
