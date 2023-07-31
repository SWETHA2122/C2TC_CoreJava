package day2;

public class NestedIf {

	public static void main(String[] args) {
		int age=20;
		if(age<=19) {
			System.out.println("Teen");
			if(age>18) { //nested if
				System.out.println("Major");
			}
			
		}
		else {
			System.out.println("adult");
			
		}
	}

	}
