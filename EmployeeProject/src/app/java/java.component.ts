import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { CommonService } from '../shared/common.service';

@Component({
  selector: 'app-java',
  templateUrl: './java.component.html',
  styleUrls: ['./java.component.css']
})
export class JavaComponent implements OnInit {

  constructor(private routes:ActivatedRoute,private cservice:CommonService) { }

  emp!:Employee;

  ngOnInit(): void {
    this.routes.paramMap.subscribe(p=>

      {
        alert("in java componenet")
        this.cservice.getemployee(parseInt(p.get('uniqueNo')!)).subscribe(data=>{this.emp=data;} )
      })

  }

}
