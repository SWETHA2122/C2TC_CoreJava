package day3;

public class Constructor {

	int id;
	String name;
	void display() {
		System.out.println(id+" "+name); //default const
	}
	
	public Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor(121,"swetha");
		Constructor c2 = new Constructor(122,"swarna");
		c1.display();
		c2.display();
		
		
	}

	
	

}

