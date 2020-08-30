package Slides29;

public class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("I am an open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("I am a close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("I am a maximizeWindow browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("I am a find element");
		
	}
	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.closeBrowser();
		obj.findElement();
		obj.openBrowser();
		obj.closeBrowser();
	}

}
