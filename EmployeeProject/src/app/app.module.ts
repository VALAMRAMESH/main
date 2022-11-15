import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminControlComponent } from './admin-control/admin-control.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import {MatToolbarModule} from '@angular/material/toolbar';

import { FormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';

import {MatButtonModule} from '@angular/material/button';

import {MatIconModule} from '@angular/material/icon';

import {MatFormFieldModule} from '@angular/material/form-field';

import {MatGridListModule} from '@angular/material/grid-list';

import {MatRadioModule} from '@angular/material/radio';

import {MatSelectModule} from '@angular/material/select';

import {MatDatepickerModule} from '@angular/material/datepicker';

import {MatCheckboxModule} from '@angular/material/checkbox';

import {MatInputModule} from '@angular/material/input';

import { MatNativeDateModule } from '@angular/material/core';

import {MatTableModule} from '@angular/material/table';

//import { RegisterComponent } from './register/register.component';

//import { AdminloginComponent } from './adminlogin/adminlogin.component';

//import { AdminregisterComponent } from './adminregister/adminregister.component';

import {MatExpansionModule} from '@angular/material/expansion';



import {MatListModule} from '@angular/material/list';
import { JavaComponent } from './java/java.component';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    AdminControlComponent,
    EmployeeLoginComponent,
    JavaComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatIconModule,

    MatNativeDateModule,

    MatSelectModule,

    FormsModule,

    MatCardModule,

    MatFormFieldModule,

    MatTableModule,

    MatRadioModule,

    MatDatepickerModule,

    MatGridListModule,MatInputModule,MatCheckboxModule,MatButtonModule,

    MatExpansionModule,

    MatListModule,
    MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
