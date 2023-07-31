package day2;

public class ContinueExample{

	public static void main(String[] args){
		for(int i=10;i<=100;i+=10) {
			if(i==50) {
				continue;
			}
			System.out.println(i);
		}
}
}
