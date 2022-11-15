import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminControlComponent } from './admin-control/admin-control.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { JavaComponent } from './java/java.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {path:"",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"login",component:LoginComponent},
  {path:"admin",component:AdminControlComponent, children:[
    {
      path:'java/:uniqueNo',component:JavaComponent
    }
  ] },
  {path:'employee',component:EmployeeLoginComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
