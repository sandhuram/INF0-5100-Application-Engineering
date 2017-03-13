/*
score: 9 + 1(extra credit)
comments: good job! consider more about corner cases
*/
package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Rose on 1/21/17.
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Assignment 2 includes 3 interview prepare questions. They
 * are similar to what you will meet during your technical interviews.Write some tests as practice.
 * Please try to think the extra credit question. The deadline of this assignment is 01/26/2017 23:59 PST.
 * Please feel free to contact me for any questions.
 */

   public class  Employee implements Comparable<Employee>
   {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    public Employee(String name, int age, Gender gender, double salary)  
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public double raiseSalary(double byPercent)
    {
    	return this.salary=salary*byPercent;
    			
    }
    
    public int compareTo(Employee Employee) 
    {
    	  double salary= ((Employee) Employee).salary; // same type object
    	  if (this.salary > salary)
    	  return 1;
    	  else if (this.salary< salary)
    	  return -1;
    	  else
    	  return 0;
    }	 
    enum Gender 
    {
    MALE,
    FEMALE;
    }

    public static class Assignment2
    {

    // Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     * @param salary 
     */
    public static void socialSecurityTax(Employee a)                                //correct
    {
    	double SST;	
    	if (a.salary<=8900){
    		SST=(6.2*a.salary/100);
    		System.out.println("Social Security tax is "+SST);
    }
    		else 
    {
    			SST=(6.2*106800/100);
    			System.out.println("Social Security tax is "+SST);
    }
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static void insuranceCoverage(Employee b)                           //correct
    {
		
    	double insurance = 0;
    	if(b.age<35)
    	{
    		insurance=3*b.salary/100;				
    		System.out.println("The insurance is "+insurance);
    	}
    	
    	else if(b.age>35 && b.age<=50)
    	{
    		insurance=4*b.salary/100;
    		System.out.println("The insurance is "+insurance);
    		
    	}
    	else if(b.age>50 && b.age<60)
    	{
    		insurance=5*b.salary/100;
    		System.out.println("The insurance is "+insurance);
    	}
    	else if(b.age>60)
    	{
    		insurance=8*b.salary/100;
    		System.out.println("The insurance is "+insurance);
        }	
    }
    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    
    public static void sortSalary(Employee e1, Employee e2, Employee e3)                
    {
    	  List <Employee> employees = new ArrayList<Employee>();
    	  employees.add(new Employee("Alice", 20, Gender.MALE, 1000));
    	  employees.add(new Employee("John", 20, Gender.FEMALE, 500));
    	  employees.add(new Employee("Jenny", 20, Gender.FEMALE, 1200));     	  
    	  System.out.println("Sort By Employee Salary");
    	  Collections.sort(employees); 
    	 for (Employee e : employees) 
    	 {
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
    
    public static void tripleSalary(Employee employee)                   //correct
    {        
    	double triplesalary=employee.raiseSalary(3);
    	System.out.println("Triple salary is " +triplesalary);
    }


    /**
     * Write a method to determine whether a number is prime
     */
    public static void isPrime(int n)                                                  //correct
    {
    	for(int i=2; i<=n/2; i++)
    	{
			if(n % i == 0)
			{			
				System.out.println("The  number " +n+ " is NOT prime");
			}
	}
		System.out.println("The  number " +n+ " is prime");
    }
		

    /**
     * Given a non-negative integer n, repeatedly add all its digits until the
     * result has only one digit. For example: Given n = 38, the process is
     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public static void addDigits(int n)                                    //miss one corner case: if n is a one-digit number, your return is 0, but you should return n 
    {
		
    	int sum = 0;
        while (n > 9 ) 
        {
                     sum=0;
            while (n > 0) 
            {
                int rem;
                rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println("The sum of the digits are " +sum);
     }

    /**
     * Write a program to check whether a given number is an ugly number. Ugly
     * numbers are positive numbers whose prime factors only include 2, 3, 5.
     * For example, 6, 8 are ugly, while 14 is not ugly since it includes
     * another prime factor 7. Note that 1 is typically treated as an ugly
     * number.
     */
    public static void isUgly(int num)                                        //miss one case:if num is -5, your program print out nothing
     {
		if(num==0) System.out.println("The  number " +num+ " is NOT ugly");
        if(num==1) System.out.println("The  number " +num+ " is ugly");
        
        if(num%2==0)
        {
            num=num/2;
        }
     
        if(num%3==0)
        {
            num=num/3;  
        }
     
        if(num%5==0)
        {
            num=num/5;
        }
      
        else
        { 
        	System.out.println("The  number is NOT ugly");
        }		
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
     //correct
     Objects are not swapped because Java uses pass by value and not pass by reference. 
     Thus any changes made in the one argument(a and b) not reflected in the other argument(x and y).
       
    */
    public static void main(String[] args) 
    {
       
    	Employee a = new Employee("Jenny", 20, Gender.FEMALE, 11000);
    	Employee b = new Employee("John", 30, Gender.MALE, 2500);
    	Employee c = new Employee("John", 30, Gender.MALE, 200);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());    
        socialSecurityTax(a);
        insuranceCoverage(b);
        isPrime(5);
        isUgly(14);
        tripleSalary(c);
        sortSalary(a, b, c);
        addDigits(482);
        
    }
    public static void swap(Employee x, Employee y) 
    {
        Employee temp = x;
        x = y;
        y = temp;
    }
}
}

