package MMP_ADMIN;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ForgotPasswordPage {

	WebDriver driver;
	Utilities ut; 

	public String pwordPageCurrentUrl()
	{
		return driver.getCurrentUrl();

	}

	public void enterEmailAndClickSend(String email)
	{
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".login.button>input"))).click();
	}

	public boolean emailRequired()
	{
		ut= new Utilities(driver);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		return ut.eleRequired(e);
	}

	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver= driver;
	}

}
