package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rose on 1/21/17.
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Assignment 2 includes 3 interview prepare questions. They
 * are similar to what you will meet during your technical interviews.Write some tests as practice.
 * Please try to think the extra credit question. The deadline of this assignment is 01/26/2017 23:59 PST.
 * Please feel free to contact me for any questions.
 */

public class  Employee implements Comparable<Employee>{
	String name;
    int age;
    Gender gender;
   double salary;// salary per month


    public Employee(String name, int age, Gender gender, double salary)  {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double raiseSalary(double byPercent){
    	return this.salary=salary*3;
    			
	}
    
    public int compareTo(Employee otherEmployee) {
    	  double salary= ((Employee) otherEmployee).salary; // same type object
    	  if (this.salary > salary)
    	   return 1;
    	  else if (this.salary< salary)
    	   return -1;
    	  else
    	   return 0;
    	 }
    	 
       

enum Gender {
    MALE,
    FEMALE;
}
public static class Assignment2{

    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     * @param salary 
     */
    public static double socialSecurityTax(Employee employee, double salary) {
		

    	double SST;
		
    	if (salary<=8900){
    		SST=(6.2*salary/100);
    		System.out.println("Social Security tax is "+SST);
    	}
    		else {
    			SST=(6.2*106800/100);
    			System.out.println("Social Security tax is "+SST);
    		}
		return SST;

//    	return 0;
        //write your code here
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee , int age,double salary) {
		
    	double insurance = 0;
    	if(age<35){
    		insurance=3*salary/100;				
    		System.out.println("The insurance is "+insurance);
    	}
    	
    	else if(age>35 && age<=50){
    		insurance=4*salary/100;
    		System.out.println("The insurance is "+insurance);
    		
    	}
    	else if(age>50 && age<=60){
    		insurance=5*salary/100;
    		System.out.println("The insurance is "+insurance);
    	}
    	else if(age>60){
    		insurance=8*salary/100;
    		System.out.println("The insurance is "+insurance);
    }
    	return insurance;
    	
    }
    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
    	

    		List <Employee> employees = new ArrayList<Employee>();
    	  employees.add(new Employee("John", 20, Gender.FEMALE, 100));
    	  employees.add(new Employee("Jenny", 20, Gender.FEMALE, 11000));
    	  employees.add(new Employee("Johny", 20, Gender.FEMALE, 1000));
    	  
    	System.out.println("----Sort By Employee Salary----");
    	 Collections.sort(employees);
    	 
    	 for (Employee e : employees) {
    		   System.out.println(" Name-> " + e.name
    		     + " Salary-> " + e.salary);
    }
        		
    }
    
   
    
    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    
    public static void tripleSalary(Employee employee) {
        
    	double triplesalary=employee.raiseSalary(3);
    	System.out.println("Triple saalry is "+triplesalary);
    }


    /**
     * Write a method to determine whether a number is prime
     */
    public static boolean isPrime(int n) {
    	for(int i=2; i<=n/2; i++){
			if(n % i == 0){
//				
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
    }
		

    /**
     * Given a non-negative integer n, repeatedly add all its digits until the
     * result has only one digit. For example: Given n = 38, the process is
     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public static int addDigits(int n) {
		
    	int sum = 0;
        while (n > 9 ) {
                     sum=0;
            while (n > 0) {
                int rem;
                rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
        }

        System.out.println(sum);
    	
    	return n;
     
    }

    /**
     * Write a program to check whether a given number is an ugly number. Ugly
     * numbers are positive numbers whose prime factors only include 2, 3, 5.
     * For example, 6, 8 are ugly, while 14 is not ugly since it includes
     * another prime factor 7. Note that 1 is typically treated as an ugly
     * number.
     */
    public static boolean isUgly(int num) {
		
    	
    	if(num==0) System.out.println(false);
        if(num==1) System.out.println(true);
//     
        if(num%2==0){
            num=num/2;
            return(isUgly(num));
        }
     
        if(num%3==0){
            num=num/3;
            return(isUgly(num));
        }
     
        if(num%5==0){
            num=num/5;
            return(isUgly(num));
//            return isUgly(num);
            
        }
      
        else{ 
        	System.out.println(false);
        }
		
		return false;
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
    Java is pass by value at all times. That's the only mechanism for both primitives and objects.

	The key is to know what's passed for objects. It's not the object itself; that lives out on the heap. It's the reference to that object that's passed by value.

	You cannot modify a passed reference and return the new value to the caller, but you can modify the state of the object it refers to - if it's mutable and exposes appropriate methods for you to call.

	The class swap with pointers, similar to what's possible with C, doesn't work because you can't change what the passed reference refers to and return the new values to the caller.
    
    http://stackoverflow.com/questions/11102878/swapping-function-java-pass-by-value-code-failed
    
    */
    public static void main(String[] args) {
        
    	
    	Employee a = new Employee("Jenny", 20, Gender.FEMALE, 11000);
    	Employee b = new Employee("John", 30, Gender.MALE, 2500);
    	Employee c = new Employee("John", 30, Gender.MALE, 200);
    	
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        
        socialSecurityTax(a, a.salary);
        insuranceCoverage(a,a.age,a.salary);
        isPrime(3);
        isUgly(14);
        tripleSalary(a);
        sortSalary(a, b, c);
        addDigits(482);
        
    }
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}


}
  

   
       


