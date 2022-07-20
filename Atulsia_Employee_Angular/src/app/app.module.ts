import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { EmployeeAllComponent } from './employee-crud/employee-all/employee-all.component';
import { EmployeeDetailsComponent } from './employee-crud/employee-details/employee-details.component';
import { UpdateEmployeeComponent } from './employee-crud/update-employee/update-employee.component';
import { AddNewEmployeeComponent } from './add-new-employee/add-new-employee.component';
import { AddEmployeeComponent } from './employee-crud/add-employee/add-employee.component';
import { ArchiveEmployeeComponent } from './employee-crud/archive-employee/archive-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeAllComponent,
    EmployeeDetailsComponent,
    UpdateEmployeeComponent,
    AddNewEmployeeComponent,
    AddEmployeeComponent,
    ArchiveEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
