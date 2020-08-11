package CallbyValueandReferance;

public class ExampleCallbyRef {

	
	public static void display(Rectangle r2){
		r2.length=20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.length=10;
		display(r1);
		System.out.println(r1.length);
	}

}
