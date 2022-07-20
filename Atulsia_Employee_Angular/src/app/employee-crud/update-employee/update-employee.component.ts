import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/pojo/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {


  employeeId: number = 0;
  submitted: boolean = false;
  employee: Employee = new Employee();
  result: boolean = false;
  active : boolean = false;
  inActive : boolean = false;

  
  constructor(private route : ActivatedRoute , private employeeService: EmployeeService , private router: Router ) { }

  ngOnInit(): void {
    this.employeeId = this.route.snapshot.params['employeeId'];
    console.log("In UpdateEmployeeComponent");
    console.log(this.employeeId);

    this.employeeService.getEmployeeDetails(this.employeeId).subscribe(
      data => {
        this.employee = data;
        if(this.employee.employeeStatus==1){
          console.log("inside if");
          this.inActive=true;
        }else
        {
          console.log("inside if");
          this.active=true;
        }
      }
    );

    
  }

  onUpdateEmployee(){
    this.employeeService.updateEmployee(this.employee).subscribe(
      data => {
        this.result = data;
        this.submitted = true;
      }
    );
  }

  goToHome(){
    this.router.navigate(['allemployees']);
  }

}
