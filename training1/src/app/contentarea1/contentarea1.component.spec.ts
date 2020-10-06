import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Contentarea1Component } from './contentarea1.component';

describe('Contentarea1Component', () => {
  let component: Contentarea1Component;
  let fixture: ComponentFixture<Contentarea1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Contentarea1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Contentarea1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
