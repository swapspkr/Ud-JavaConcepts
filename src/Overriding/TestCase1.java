package Overriding;

public class TestCase1 extends Base{

	String browserName="ie";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCase1 tc = new TestCase1();
		tc.initBrowser();

	}

	public void initBrowser(){
		WebDriver dr = getBrowserInstance(browserName);
		dr.click();
		dr.sendKeys();
		dr.getTitle();
	}
}
