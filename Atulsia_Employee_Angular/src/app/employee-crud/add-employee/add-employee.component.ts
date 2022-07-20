import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
  employee: Employee = new Employee();
  result: boolean = false;
  submitted: boolean = false;

  constructor(private employeeService: EmployeeService , private router: Router) { }

  ngOnInit(): void {
    this.employee=new Employee();
  }

  onAddEmployee(){
    console.log(this.employee);
    this.employee.employeeStatus=1;
    this.employee.archiveStatus=0;
    this.employeeService.addNewEmployee(this.employee).subscribe(data => {
      this.result = data;
      console.log(data);
      this.submitted = true;
    });
  }

  goToHome(){
    console.log("in goToHome()");
    this.router.navigate(['allemployees']);
  }

  addMOre(){
    this.submitted = false;
    this.employee=new Employee();
    this.router.navigate(['addnewemployee']);
  }
  

}
