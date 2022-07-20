import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-employee-all',
  templateUrl: './employee-all.component.html',
  styleUrls: ['./employee-all.component.css']
})
export class EmployeeAllComponent implements OnInit {
  employee: Employee = new Employee();
  allEmployees: Employee[] = [];
  result: boolean = false;
  submitted: boolean = false;
  constructor(private employeeService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
    this.getAllEmployees();
  }

  getAllEmployees() {
    this.employeeService.getAllEmployees().subscribe(
      data => {
        this.allEmployees = data;
        console.log("All employee Data"+data);
      }
    );
  }


  deleteEmployee(employeeId: number){
    console.log("deleteEmployee() called");
    console.log("delete employeeId : " + employeeId);
    this.employeeService.deleteEmployee(employeeId).subscribe(data => {
      this.result = data;
      if(this.result == true)
        this.getAllEmployees();
    });
  }

  updateEmployee(employeeId: number){
    console.log("updateEmployee() called");
    console.log("update employeeId : " + employeeId);
    this.router.navigate(['updateemployee',employeeId]);
  }

  employeeDetails(employeeId: number){
    console.log("employeeDetails() called");
    console.log(" employeeId : " + employeeId);
    this.router.navigate(['employeedetails',employeeId]);
  }

  addEmployee(){
    console.log("addEmployee() called");
   
    this.router.navigate(['addnewemployee']);
  }

  
  archiveEmployee(employeeId: number){
    console.log("archiveEmployee() called");
    console.log(" employeeId : " + employeeId);
    this.employee.archiveStatus=1;
    this.employee.employeeId=employeeId;
    this.employeeService.archiveEmployee(this.employee).subscribe(
      data => {
        this.result = data;
        //this.submitted = true;
        this.getAllEmployees();
      }
    );
  }

  getArchiveEmployee(){
    console.log("addEmployee() called");
    this.router.navigate(['archiveEmployeedetails']);
  }
}




