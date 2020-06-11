 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  double t;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  
	  myTestMethod(t);
	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	       public static void myTestMethod(...){

         
		
		double num1 = 2.4;
		double num2 = 3;
		double num3 = 6;
		double num4 = 5.5;
		double res = 0;
		 res = (num1 + num2 + num3 + num4 )/4;
		System.out.println("The average of numbers is " + res);
	

		   }
	 
	   

}
