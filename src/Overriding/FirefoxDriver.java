package Overriding;

public class FirefoxDriver extends WebDriver {

	public void sendKeys(){
		System.out.println("Sendkeys in FirefoxDriver");
	}
	public void click(){
		System.out.println("Clicking on FirefoxDriver");
	}
}
