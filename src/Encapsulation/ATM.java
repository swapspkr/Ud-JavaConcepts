package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new Bank();
		obj.updatePin(123453, 1234, 5895);
		obj.withdrawAmount(123453, 5895, 1523);
		obj.depositCash(123453, 5895, 235896.65);
		
		System.out.println("Available balance in Account No:- "+obj.getAccountNo()+" is "+obj.getBalanceAmount());
		
	}
}
