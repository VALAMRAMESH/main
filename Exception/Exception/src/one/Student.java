package one;
/*WAP to take student marks of different subject in class StudentResult which is 
associated with  Student class in following way:-
Class Student
{
 Int rollno;
 String sname;
String saddress;
StudentResult srobj;
Setter and getter for all class variable.
}
Create your own Exception class with name ResultException. This exception will be thrown when 
user is failed in more than 1 subject. 
You also need to throw exception when user mistakenly input the negative marks. 
If user total score is less than 40% you need to through fail exception
*/

public class Student {

	int rollno;
	String sname;
	String saddress;
	StudentResult srobj;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Student(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}

	
	

	

}