package Org.Arpitha.Project.TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("http://www.google.com");
		 driver.close();

	}

}
