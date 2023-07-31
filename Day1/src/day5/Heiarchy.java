package day5;
class country{  
void nation(){System.out.println("India");}  
}  
class state extends country{  
void dist(){System.out.println("barking...");}  
}  
class district extends state{  
void city(){System.out.println("Villupuram");}  
}  

class Heiarchy{

	public static void main(String[] args) {
		district c =new district();  
		c.nation();  
		c.city();  
		 
		}

	}

