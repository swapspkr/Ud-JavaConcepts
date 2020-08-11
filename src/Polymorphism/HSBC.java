package Polymorphism;

public class HSBC extends RBI {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			HSBC ob = new HSBC();
			System.out.println(ob.getHomeLoanROI());

		}
		
		public double getHomeLoanROI( ){
			
			return 10.5;
		}

		public HSBC getObj(){
			HSBC obj = new HSBC();
			return obj;
		}
}
