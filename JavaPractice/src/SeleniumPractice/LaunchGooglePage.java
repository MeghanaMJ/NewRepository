package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGooglePage {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		driver.get("https://www.google.com/");
	}
}
