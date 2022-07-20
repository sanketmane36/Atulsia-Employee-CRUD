import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../pojo/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  baseURL: string = "http://localhost:8080/employeeapi/employees";
  constructor(private http: HttpClient) { }

  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseURL + '/getallemployee');
  }

  getEmployeeDetails(employeeId: number): Observable<Employee> {
    return this.http.get<Employee>(this.baseURL + "/" + employeeId);
  }
  
  addNewEmployee(employee: Employee): Observable<boolean> {
    return this.http.post<boolean>(this.baseURL + "/addemployee", employee);
  }

  updateEmployee(employee: Employee): Observable<boolean> {
    return this.http.put<boolean>(this.baseURL+"/updateemployee" , employee);
  }

  deleteEmployee(employeeId: number): Observable<boolean> {
    return this.http.delete<boolean>(this.baseURL + "/deleteemployee/" + employeeId);
  }

  archiveEmployee(employee: Employee): Observable<boolean> {
    return this.http.put<boolean>(this.baseURL+ "/archive" , employee);
  }
  // archiveEmployee(employeeId: number): Observable<boolean> {
  //   return this.http.get<boolean>(this.baseURL+ "/archive/" + employeeId);
  // }

  getArchiveEmployee(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseURL + '/getallArchiveemployee');
  }
  


}
