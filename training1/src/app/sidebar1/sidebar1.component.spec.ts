import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Sidebar1Component } from './sidebar1.component';

describe('Sidebar1Component', () => {
  let component: Sidebar1Component;
  let fixture: ComponentFixture<Sidebar1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Sidebar1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Sidebar1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
