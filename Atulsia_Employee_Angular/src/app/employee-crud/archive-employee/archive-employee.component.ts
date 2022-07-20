import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-archive-employee',
  templateUrl: './archive-employee.component.html',
  styleUrls: ['./archive-employee.component.css']
})
export class ArchiveEmployeeComponent implements OnInit {
  employee: Employee = new Employee();
  allEmployees: Employee[] = [];
  result: boolean = false;
  constructor(private route: ActivatedRoute, private employeeService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
    this.getAllArchiveEmployees();
  }

  

  getAllArchiveEmployees() {
    this.employeeService.getArchiveEmployee().subscribe(
      data => {
        this.allEmployees = data;
        console.log("All employee Data"+data);
      }
    );
  }

  unArchiveEmployee(employeeId: number){
    console.log("archiveEmployee() called");
    console.log(" employeeId : " + employeeId);
    this.employee.archiveStatus=0;4
    this.employee.employeeId=employeeId;
    this.employeeService.archiveEmployee(this.employee).subscribe(
      data => {
        this.result = data;
        //this.submitted = true;
        this.getAllArchiveEmployees();
      }
    );
  }

  goToHome(){
    this.router.navigate(['allemployees']);
  }
}
