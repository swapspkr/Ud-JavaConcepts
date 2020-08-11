package Overriding;

public class IEDriver extends WebDriver {

	public void sendKeys(){
		System.out.println("Sendkeys in IEDriver");
	}
	public void click(){
		System.out.println("Clicking in IEDriver");
	}
}
