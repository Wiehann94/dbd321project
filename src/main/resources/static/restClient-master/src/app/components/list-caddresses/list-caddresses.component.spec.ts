import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCAddressesComponent } from './list-caddresses.component';

describe('ListCAddressesComponent', () => {
  let component: ListCAddressesComponent;
  let fixture: ComponentFixture<ListCAddressesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListCAddressesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListCAddressesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
