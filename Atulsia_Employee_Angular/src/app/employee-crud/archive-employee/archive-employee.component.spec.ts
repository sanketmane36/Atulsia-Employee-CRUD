import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArchiveEmployeeComponent } from './archive-employee.component';

describe('ArchiveEmployeeComponent', () => {
  let component: ArchiveEmployeeComponent;
  let fixture: ComponentFixture<ArchiveEmployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArchiveEmployeeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArchiveEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
