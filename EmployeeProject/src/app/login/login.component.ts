import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { CommonService } from '../shared/common.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb:FormBuilder,private route:Router,private cservice:CommonService) { }

  loginForm!:FormGroup;
  emp= new Employee();

  ngOnInit(): void {
    this.createLoginForm();
  }
createLoginForm()
{
  this.loginForm=this.fb.group(
    {
      userName!:[''],
      password!:['']
    }
  )
}
onLoginSubmit()
{
  if(this.loginForm.get('userName')?.value=="admin" && this.loginForm.get('password')?.value=="admin") 
  {
    this.route.navigate(['/admin'])
  }
  else{
    this.cservice.getEmployeeList().subscribe(list=>
      {
        for(let emp of list)
        {
          if(this.loginForm.get('userName')?.value==emp.userName && this.loginForm.get('password')?.value==emp.password)
          {
            console.log(emp);
            this.cservice.setPerticularEmployee(JSON.stringify(emp))
            this.route.navigate(['/employee']) 
          }
        }
      })
  }
  
  // else{
  //   this.cservice.getPerticularEmployee(this.loginForm.value).subscribe(
  //     singleEmp=>{this.emp=singleEmp
  //       console.log(this.emp);
  //       this.cservice.setPerticularEmployee(JSON.stringify(singleEmp))
  //       //sessionStorage.setItem('perticularEmp',JSON.stringify(singleEmp))
  //       this.route.navigate(['/employee'])
  //     }
       
  //   );
  //   console.log(this.loginForm.value);
  //   //console.log(this.emp);
    
  // }
  
 
 
}
}
