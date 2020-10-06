import { Component, OnInit } from '@angular/core';
import { Employee } from '../add-employee/employee';

@Component({
  selector: 'app-modify-employee',
  templateUrl: './modify-employee.component.html',
  styleUrls: ['./modify-employee.component.css']
})
export class ModifyEmployeeComponent  {
  showModal : boolean;
  showModal1 : boolean;
  showModal2 : boolean;
  employeeModel = new Employee(1001, 'Ram', 'Kumar' , 'Singh', 'rks@gmail.com' ,'Mumbai' , 1234567890);
  date : Date = new Date("2019-01-16");
  str = this.date.toDateString();
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
  onClick2(event)
  {
    this.showModal2 = true; // Show-Hide Modal Check
   
  }
  //Bootstrap Modal Close event
  hide2()
  {
    this.showModal2 = false;
  }

  

}
