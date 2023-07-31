package day3;

public class Encapsulation {
	private String name;
	private int id;
	private long mbl_no;
	public Encapsulation() {
		super();
		
	}
	public Encapsulation(String name, int id, long mbl_no) {
		super();
		this.name = name;
		this.id = id;
		this.mbl_no = mbl_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMbl_no() {
		return mbl_no;
	}
	public void setMbl_no(long mbl_no) {
		this.mbl_no = mbl_no;
	}
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Swetha");
		obj.setId(201021121);
		obj.setMbl_no(798090634);
		System.out.println("Name :"+ obj.getName());
		System.out.println("Id :"+ obj.getId());
		System.out.println("Mob_No :"+ obj.getMbl_no());
	}
	
	

}
