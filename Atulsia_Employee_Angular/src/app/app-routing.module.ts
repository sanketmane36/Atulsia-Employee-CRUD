import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddEmployeeComponent } from './employee-crud/add-employee/add-employee.component';
import { ArchiveEmployeeComponent } from './employee-crud/archive-employee/archive-employee.component';
import { EmployeeAllComponent } from './employee-crud/employee-all/employee-all.component';
import { EmployeeDetailsComponent } from './employee-crud/employee-details/employee-details.component';
import { UpdateEmployeeComponent } from './employee-crud/update-employee/update-employee.component';

const routes: Routes = [
  { path: '', redirectTo: 'allemployees', pathMatch: 'full' },
  { path:'allemployees' , component: EmployeeAllComponent},
  
  {path: 'employeedetails', component: EmployeeDetailsComponent },
  { path: 'addnewemployee', component: AddEmployeeComponent },
  { path: 'employeedetails/:employeeId', component: EmployeeDetailsComponent },
  { path: 'updateemployee/:employeeId', component: UpdateEmployeeComponent },
  {path: 'archiveEmployeedetails', component: ArchiveEmployeeComponent }
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
