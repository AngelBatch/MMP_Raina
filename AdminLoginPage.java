package MMP_ADMIN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLoginPage {
	WebDriver driver;
	Utilities ut;
	public void enterUnamePword(String username, String password)
	{	
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void handlePopup(){

		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void clickOnSignIn()
	{
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='login1']/p[6]/input"))).click();
	}

	public String validatePopup()
	{
		Alert a = driver.switchTo().alert();
		return a.getText();
	}

	public void clickOnFrgtPword()
	{
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("forgot Username / Password"))).click();
		
		
	}
	
	public Boolean unameRequired()
	{
		ut= new Utilities(driver);
	WebDriverWait wait= new WebDriverWait(driver, 10);
	WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		return ut.eleRequired(e);
	}

	public Boolean pwordRequired()
	{
		ut= new Utilities(driver);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		return ut.eleRequired(e);
		
	}
	
	
	public AdminLoginPage(WebDriver driver)
	{
		this.driver= driver;
	}

}
