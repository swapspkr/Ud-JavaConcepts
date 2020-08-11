package CallbyValueandReferance;

public class ExampleCallbyValue {

	
	public static void display(int data){
		data=20;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		display(x);
		System.out.println(x);
	}

}
