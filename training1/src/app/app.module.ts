import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { ContentareaComponent } from './contentarea/contentarea.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { ModifyEmployeeComponent } from './modify-employee/modify-employee.component';
import { RemoveEmployeeComponent } from './remove-employee/remove-employee.component';
import { TrainingDetailsComponent } from './training-details/training-details.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { FormsModule } from '@angular/forms';
import { Sidebar1Component } from './sidebar1/sidebar1.component';
import { Contentarea1Component } from './contentarea1/contentarea1.component';


@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    ContentareaComponent,
    NavbarComponent,
    AddEmployeeComponent,
    ModifyEmployeeComponent,
    RemoveEmployeeComponent,
    TrainingDetailsComponent,
    EmployeeListComponent,
    Sidebar1Component,
    Contentarea1Component,
  
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
