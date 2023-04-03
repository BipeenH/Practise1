package Assignments;

import java.util.Scanner;

public class Assignment_temp {
	public static void main(String[] args) {
		Scanner MyScanObj = new Scanner(System.in);
		
		double temp = MyScanObj.nextDouble();
		System.out.println("Enter Temperature" + temp);
		
			
		
		System.out.println("temp in Fahrenheit is " + ((1.8 * temp)+ 32));
		System.out.println("temp in Kelvin is " + (temp + 273));
	}

	
	

}
