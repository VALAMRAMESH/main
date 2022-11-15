import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { CommonService } from '../shared/common.service';

@Component({
  selector: 'app-employee-login',
  templateUrl: './employee-login.component.html',
  styleUrls: ['./employee-login.component.css']
})
export class EmployeeLoginComponent implements OnInit {

  constructor(private fb:FormBuilder,private cservice:CommonService,private route:ActivatedRoute) { }

  //emp!:any[];
  //data=sessionStorage.getItem('perticularEmp');
  
  updateform!:FormGroup;

  ngOnInit(): void {
     //this.emp = JSON.parse(sessionStorage.getItem('perticularEmp')!);
    // console.log(this.emp);
    this.updateform=this.fb.group(

      {

        uniqueNo: [''],

  employeeName:[''],
  userName:[''],

  password:[''],

  projectAllocated:[''],

  projectName:[''],

  primarySkill:[''],

  lastWorkingDate:[''],

  coreJava:[''],

  java8:[''],

  angular:[''],

  reactJS:[''],

  nodeJS:[''],
  html:[''],

  jQuery:[''],

  jsp:[''],

  springBoot:[''],

  springMVC:[''],

  springJPA:[''],

  springSecurity:[''],

  hibernate:[''],

  oracle:[''],

  mysql:[''],

  nosql:[''],

  postgress:[''],

  aws:[''],

  springCloud:[''],

  google:[''],

  linux:[''],

  git:[''],

  docker:[''],

  totalYearOfITExperience:[''],

  interest:[''],

  email:[''],

  mobileNo:[''],
  uploadResume:[''],
  baseLocation:[''],
ctc:[''],
dateOfJoining:[''],
preferedLocation:['']

  }
    );

    this.editData();
} 

editData()
{
  let empobj:any=this.cservice.getperticularEmployee();
       this.updateform.get('employeeName')?.setValue(empobj.employeeName);

      this.updateform.get('projectAllocated')?.setValue(empobj.projectAllocated);

      this.updateform.get('projectName')?.setValue(empobj.projectName);

     this.updateform.get('uniqueNo')?.setValue(empobj.uniqueNo);

        this.updateform.get('userName')?.setValue(empobj.userName);

        this.updateform.get('password')?.setValue(empobj.password);

        this.updateform.get('baseLocation')?.setValue(empobj.baseLocation);

        this.updateform.get('primarySkill')?.setValue(empobj.primarySkill);  
        this.updateform.get('lastWorkingDate')?.setValue(empobj.lastWorkingDate);

        this.updateform.get('coreJava')?.setValue(empobj.coreJava);

        this.updateform.get('java8')?.setValue(empobj.java8);

        this.updateform.get('angular')?.setValue(empobj.angular);
        this.updateform.get('reactJS')?.setValue(empobj.reactJS);
        this.updateform.get('nodeJS')?.setValue(empobj.nodeJS);
        this.updateform.get('html')?.setValue(empobj.html);
        this.updateform.get('jQuery')?.setValue(empobj.jQuery);

        this.updateform.get('hibernate')?.setValue(empobj.hibernate);

        this.updateform.get('springBoot')?.setValue(empobj.springBoot);

        this.updateform.get('springMVC')?.setValue(empobj.springMVC);

        this.updateform.get('springJPA')?.setValue(empobj.springJPA);

        this.updateform.get('jsp')?.setValue(empobj.jsp);
        this.updateform.get('email')?.setValue(empobj.email);

        this.updateform.get('springSecurity')?.setValue(empobj.springSecurity);

        this.updateform.get('oracle')?.setValue(empobj.oracle);
        this.updateform.get('mysql')?.setValue(empobj.mysql);
        this.updateform.get('nosql')?.setValue(empobj.nosql);
        this.updateform.get('postgress')?.setValue(empobj.postgress);
        this.updateform.get('aws')?.setValue(empobj.aws);
        this.updateform.get('springCloud')?.setValue(empobj.springCloud);
        this.updateform.get('google')?.setValue(empobj.google);
        this.updateform.get('linux')?.setValue(empobj.linux);
        this.updateform.get('git')?.setValue(empobj.git);
        this.updateform.get('docker')?.setValue(empobj.docker);
        this.updateform.get('interest')?.setValue(empobj.interest);
        this.updateform.get('baseLocation')?.setValue(empobj.baseLocation);
        this.updateform.get('ctc')?.setValue(empobj.ctc);
        this.updateform.get('dateOfJoining')?.setValue(empobj.dateOfJoining);
        this.updateform.get('preferedLocation')?.setValue(empobj.preferedLocation);
        this.updateform.get('email')?.setValue(empobj.email);
        this.updateform.get('mobileNo')?.setValue(empobj.mobileNo);
        this.updateform.get('totalYearOfITExperience')?.setValue(empobj.totalYearOfITExperience);
        this.updateform.get('uploadResume')?.setValue(empobj.uploadResume);
}

onSubmit()
{
  this.cservice.employeeUpdate(this.updateform.value).subscribe()
  alert("data update successfully")
}


// primarySkill = new FormControl();
// toppingList: string[] = ['Java', 'UI', 'DB', 'CloudComputing'];

primarySkill=
[
  {id:"UI",value:'UI'},
  {id:"JAVA",value:'JAVA'},
  {id:"DB",value:'DB'},
  {id:"CloudComputing",value:'CloudComputing'},
  
]


baseLocation=
[
  {id:"Pune",value:'Pune'},
  {id:"Indore",value:'Indore'},
  {id:"Banglore",value:'Banglore'},
  
]


step = 0;
  setStep(index: number) {

    this.step = index;

  }
  nextStep() {

    this.step++;

  }
  prevStep() {

    this.step--;

  }

}
