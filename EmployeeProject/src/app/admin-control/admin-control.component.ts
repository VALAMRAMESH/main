import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { CommonService } from '../shared/common.service';

import * as XLSX from "xlsx";

@Component({
  selector: 'app-admin-control',
  templateUrl: './admin-control.component.html',
  styleUrls: ['./admin-control.component.css']
})
export class AdminControlComponent implements OnInit {

  constructor(private cservice:CommonService) { }
  emplist!:Employee[];
  
  ngOnInit(): void {
    this.cservice.getEmployeeList().subscribe(
      list=>{this.emplist=list}
    )
  }

  //displayedColumns: string[] = ['id', 'employeeName', 'username','password'];

  fileName ="ExcelSheet.xlsx";

  createExcel()
  {
    let element=document.getElementById("excel-sheet");
    const ws:XLSX.WorkSheet=XLSX.utils.table_to_sheet(element);

    const wb:XLSX.WorkBook=XLSX.utils.book_new();
    XLSX.utils.book_append_sheet(wb,ws,"sheet1");


    XLSX.writeFile(wb,this.fileName);
  }

  delete(uniqueNo:number)

  {

alert("delete")

this.cservice.deleteEmployee(uniqueNo).subscribe();

location.reload();

  }

}
