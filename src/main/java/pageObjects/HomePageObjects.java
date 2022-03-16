package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	WebDriver driver=null;
	
	
	
	public HomePageObjects(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	
	
	public void clickOnSideMenu(String menu) {
		String MenuXpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']";
		driver.findElement(By.xpath(MenuXpath)).click();
	}

	//click on sub menu bar - by passing name of menu
	public void clickOnSideSubMenu(String menu, String submenu) {
		String MenuXpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']";
		driver.findElement(By.xpath(MenuXpath)).click();
		String submenuXpath="//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']/ancestor::a/following-sibling::ul//span[text()='"+submenu+"']";
		driver.findElement(By.xpath(submenuXpath)).click();
	}

}
