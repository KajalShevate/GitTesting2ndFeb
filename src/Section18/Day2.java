package Section18;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void postrequisite()
	{
		System.out.println("I will exxecute Last!");
	}
	@Test(groups= {"Smoke"})
	public void pLoan()
	{
		System.out.println("personal loan in Day2");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will run first!");
	}
}
