package MMP_ADMIN;


import org.openqa.selenium.WebDriver;
public class AdminHomePage {


	WebDriver driver;

	public boolean checkForAdminHome()
	{	
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("Admin-Build.2.1.000/index"))
		{System.out.println("logged in");
		return true;}
		else
		{		System.out.println("not loggedin");
		return false ;}
	
		//			if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-title"))).isDisplayed())
		//		{System.out.println("is present");
		//			return true;}
		//		else
		//			//System.out.println("not present");
		//		return false ;

	}

	public AdminHomePage(WebDriver driver)
	{
		this.driver= driver;

	}



}
