package day5;
class grandparent {
    int a;
	void display() {
	   System.out.println("GrandParent class");
}
}
class parent extends grandparent{
	int b;
	void run() {
		   System.out.println("Parent class");
	}
	}
class  Child extends parent{
	int c;
	void show(){
		System.out.println("Child class");
	}
	
}

public class Multilevel{

	public static void main(String[] args) {
		Child mc = new Child();
		mc.b=10;
		System.out.println(mc.b);
		mc.display();

	}

}
