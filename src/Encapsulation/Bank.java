package Encapsulation;

public class Bank {
	
	
	public int accountNo=123453;
	private int pincode=1234;
	private double balanceAmount=500000;
	
	public void withdrawAmount(int account, int pin , int amount){
		if(account==accountNo && pin==pincode){
			if(amount<balanceAmount){
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount withdrawn:"+amount);
				System.out.println("Balance in account:"+balanceAmount);
			}
			else
			{
				System.out.println("Insufficient balance");
			}
		}
		else
		{
			System.out.println("Account no. or Pin is incorrect:");
		}
		
	}

	public void updatePin(int account,int oldpin ,int newpin){
	
		if(account==accountNo && oldpin==pincode){
			pincode=newpin;
			System.out.println("Pin updated successfully");
		}else
		{
			System.out.println("Invalid credentials");
		}
		
	}
	
	public double depositCash(int accNo,int pin , double amount) {
		if(accNo==accountNo && pin==pincode){
			balanceAmount = balanceAmount+amount;
			System.out.println("Amount deposited successfully::");
			return balanceAmount;
		}else
		{
			System.out.println("Invalid credentials while depositing Cash");
			return balanceAmount;
		}
		}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	}
