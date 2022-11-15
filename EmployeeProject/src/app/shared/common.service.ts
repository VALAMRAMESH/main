import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee';


@Injectable({
  providedIn: 'root'
})
export class CommonService {

  url:string="http://localhost:9090";
  //url1:string=""

  constructor(private http:HttpClient) { }

  getEmployeeList():Observable<Employee[]>
  {
    return this.http.get<Employee[]>(this.url+"/show");
  }

  // getPerticularEmployee(emp:Employee ):Observable<Employee>
  // {
  //   console.log(emp)
  //   console.log(this.url+"/login/"+emp.userName+"/"+emp.password);
  //   return this.http.get<Employee>(this.url+"/login/"+emp.userName+"/"+emp.password);
  // }

  // getPerticularEmployee(emp:Employee ):Observable<Employee>
  // {
  //   console.log(emp)
  //   console.log(this.url+"/login/"+emp.userName+"/"+emp.password);
  //   return this.http.post<Employee>(this.url+"/login",emp);
  // }

  employeeSave(emp:Employee):Observable<Employee>
  {
    return this.http.post<Employee>(this.url+"/save",emp);
  }

  setPerticularEmployee(emp:any)

  {

    console.log(emp);

    localStorage.setItem("ee",emp);

  }

getperticularEmployee()

{

 let emp= localStorage.getItem("ee");

  if(emp!=null)

  {
    console.log(emp);
    return JSON.parse(emp);

  }

}

  employeeUpdate(emp:Employee):Observable<Employee>
  {
    alert("in update service");
    return this.http.put<Employee>(this.url+"/update/"+emp.uniqueNo,emp);
   
  }

  getemployee(uniqueNo:number):Observable<Employee>
{
return this.http.get<Employee>(this.url+"/getemp/"+uniqueNo);
}

deleteEmployee(uniqueNo:number):Observable<number>

{
  return this.http.delete<number>(this.url+"/delete/"+uniqueNo);
}

}
