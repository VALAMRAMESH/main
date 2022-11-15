package Two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*// WAP to take Employee daily attendance in an array of int with name presentdays. You also take 
salary per month of the Employee. You need to calculate the total day an employee is present. 
Employee will input in following format P for present, L for leave it will be paid leave, A for absent, 
N for no information about this day. 
An employee can not take more than 2 leaves in a month if he takes more than two leave you need 
to throw the exception. LeaveExceedLimitException. 
If for any employee N is continuously for four days you need to throw exception 
EmployeeAbscondingException. In this case salary will not be calculated. 
If all goes good you need to print the total salary of employee for that particular month.*/

public class Employee {
	char[] presentDay;
	int salary;

	public Employee(char[] presentDay, int salary) {
		this.presentDay = presentDay;
		this.salary = salary;
	}

	public static void main(String[] args) {
		char[] arr = { 'L', 'L', 'L', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P',
				'P', 'P', 'P', 'P', 'P', 'P', 'P', 'N', 'N', 'N', 'L' };
		int leave = 0;// tracker for counting the number of leaves
		int countNonInfoTrack = 0;// tracker for continuous leaves
		int countMaxNonInfo = 0;// holding the max of continuous leaves
		int present = 0;
		int sal = 30000;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'L')
				leave++;
			if (arr[i] == 'P')
				present++;
			if (arr[i] == 'N') {
				countNonInfoTrack++;
				if (countMaxNonInfo < countNonInfoTrack) {
					countMaxNonInfo = countNonInfoTrack;
				}
			} else
				countNonInfoTrack = 0;

		}
		if (countMaxNonInfo >= 4) {
			try {
				throw new EmployeeAbscondingException("Fired");
			} catch (EmployeeAbscondingException eae) {
				System.out.print("fired");
			}
		} else {
			int empSal = (sal / 30) * present;
			System.out.println(empSal);
			if (leave > 2) {
				try {
					throw new LeaveExceedLimitException("Leave Exceded");
				} catch (LeaveExceedLimitException lee) {
					System.out.println("Leave exceded");
				}
			}

		}

	}
}