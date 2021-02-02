package Section18;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void beforeclassMethod()
	{
		System.out.println("Before executing any method in the class");
	}
	
	@AfterClass
	public void AfterclassMethod()
	{
		System.out.println("After executing any method in the class");
	}

	@Test(timeOut=4000)
	public void WebLoginCarLoan()
	{
		System.out.println("Web Car Loan");
	}
	
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username,String password)
	{
		System.out.println("Mobile Car Loan");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeMethod
	public void BeforeEverymethod()
	{
		System.out.println("Before every method");
	}

	@AfterMethod
	public void AfterEveryMethodmethod()
	{
		System.out.println("After every method");
	}
	@BeforeSuite
	public void MobileSignInCarLoan()
	{
		System.out.println("I am No 1");
	}
	
	@AfterSuite
	public void MobileSignOutCarLoan()
	{
		System.out.println("I am the last one!");
	}
	@Parameters({"URLCar"})
	@Test(groups= {"Smoke"})
	public void LoginAPICarLoan(String urlName)
	{
		System.out.println("Login API Car Loan");
		System.out.println(urlName);
	}
	
	@DataProvider()
	public Object[][] getData() 
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
