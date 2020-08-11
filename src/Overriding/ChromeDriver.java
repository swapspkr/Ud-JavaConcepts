package Overriding;

public class ChromeDriver extends WebDriver  {

	public void sendKeys(){
		System.out.println("Sendkeys in chromeBrowser");
	}
	public void click(){
		
		System.out.println("Clicking in chromeBrowser");
	}
}
