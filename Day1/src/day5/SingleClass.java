package day5;

class Car{
	    int a;
		void display() {
		   System.out.println("pls stop");
	}
	}
	class Drive extends Car{
		int b;
		void run() {
			   System.out.println("go");
		}
		}
		

public class SingleClass {

	public static void main(String[] args) {
		Drive ch =new Drive();
		 ch.b=20;
		 System.out.println(ch.b);
		 ch.display();
		 ch.run();

	}

}
