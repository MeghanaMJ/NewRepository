package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver=new ChromeDriver();
		for (int i = 0; i <=10; i++) {
			System.out.print(" "+i);
			//System.out.println();
		}
	}

}
