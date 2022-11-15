import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonService } from '../shared/common.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private cservice:CommonService,private fb:FormBuilder) { }

registerForm!:FormGroup;

  ngOnInit(): void {
    this.registerForm=this.fb.group(
      {
        uniqueNo:[],
        //email:[''],
        employeeName:[''],
        userName:[''],
        password:['']
      }
    )
  }

  onSubmit()
  {
    if(this.registerForm.valid)
    {
      this.cservice.employeeSave(this.registerForm.value).subscribe();
      window.location.reload();
    }
    
  }

}
