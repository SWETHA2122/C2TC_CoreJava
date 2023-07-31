package day2;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		int marks;
		Scanner student = new Scanner(System.in);  // Create a Scanner object
		
		System.out.print("Enter Your Marks: ");
		marks = student.nextInt();
		
		if(marks >=90)
			System.out.println("grade: O");
		else if(marks<90 && marks>=80)
			System.out.println("Grade: A+");	
		else if(marks<=80 && marks>=70)
			System.out.println("Grade: A");
		else if(marks<=70 && marks>=60)
			System.out.println("Grade: B+");
		else if(marks<=60 && marks>=50)
			System.out.println("Grade: B");
		else
			System.out.println("U");
			
		}
	}

	
