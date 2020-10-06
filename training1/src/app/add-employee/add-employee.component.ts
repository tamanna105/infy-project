import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee} from './employee'

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent  {
  constructor(private router : Router) {}
  employeeModel = new Employee(1001, 'Ram', 'Kumar' , 'Singh', 'rks@gmail.com' ,'Mumbai' , 1234567890);
  date : Date = new Date("2019-01-16");
  showModal : boolean;
  showModal1 : boolean;
  onClick(event)
  {
    this.showModal = true; // Show-Hide Modal Check
   
  }
  //Bootstrap Modal Close event
  hide()
  {
    this.showModal = false;
  }
  onClick1(event)
  {
    this.showModal1 = true; // Show-Hide Modal Check
  }
  //Bootstrap Modal Close event
  hide1()
  {
    this.showModal1 = false;
  }
  clearForm()
  {
    (<HTMLFormElement>document.getElementById("employeeform")).reset();

  }
  btnClick()
  {
    this.router.navigateByUrl("/employee-list");
  }

}
