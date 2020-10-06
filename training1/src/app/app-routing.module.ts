import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { ModifyEmployeeComponent } from './modify-employee/modify-employee.component';
import { RemoveEmployeeComponent } from './remove-employee/remove-employee.component';
import { TrainingDetailsComponent } from './training-details/training-details.component';


const routes: Routes = [
  { path : 'employee-list' , component : EmployeeListComponent },
    { path : 'add-employee', component : AddEmployeeComponent},
    { path : 'modify-employee' , component : ModifyEmployeeComponent},
    { path : 'remove-employee' , component : RemoveEmployeeComponent},
    { path : 'training-details' , component : TrainingDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
