package Slides29;

public class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("I am an open browser gecko");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("I am an close browser gecko");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("I am an maximized gecko");
		
	}

	@Override
	public void findElement() {
		System.out.println("I am a find element gecko");
		
	}
	public static void main(String[] args) {
		WebDriver obj= new FirefoxDriver();
		obj.closeBrowser();
		obj.findElement();
		obj.openBrowser();
		obj.closeBrowser();
	}

}
