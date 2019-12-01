import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileschildComponent } from './mobileschild.component';

describe('MobileschildComponent', () => {
  let component: MobileschildComponent;
  let fixture: ComponentFixture<MobileschildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobileschildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobileschildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
