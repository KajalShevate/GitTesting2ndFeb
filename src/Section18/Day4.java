package Section18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan(String uname)
	{
		System.out.println("Web Home Loan");
		System.out.println(uname);
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("Mobile Home Loan");
	}
	
	@Test(enabled=true)
	public void LoginAPIHomeLoan()
	{
		System.out.println("Login API Home Loan");
	}
}
