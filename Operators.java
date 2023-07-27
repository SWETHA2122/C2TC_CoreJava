package Basics;

public class Operators {
		    public static void main(String[] args) {
		        int a = 10;
		        int b = 5;

		        System.out.println("Add: " +(a + b));
		        System.out.println("Sub: " + (a - b));
		        System.out.println("Mul: " + ( a * b));
		        System.out.println("Quotient: " + (a / b));
		        System.out.println("Remainder: " + (a%b));
		        a++; // Increment by 1
		        b--; 
		        System.out.println(a);
		        boolean x = true;
		        boolean y = false;

		        boolean andResult = x && y;
		        boolean orResult = x || y;
		        boolean notX = !x;
		        boolean notY = !y;

		        System.out.println("x AND y: " + andResult);
		        System.out.println("x OR y: " + orResult);
		        System.out.println("NOT x: " + notX);
		        System.out.println("NOT y: " + notY);
		        
		    }
		

	}

