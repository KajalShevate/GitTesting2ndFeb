package Section18;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1TestNG {

	@Test
	public void demo() {

		System.out.println("Hello TestNG");
		Assert.assertTrue(false);

	}
	@Parameters({"URL"})
	@Test
	public void secondTest(String uname)
	{
		System.out.println("By TestNG!");
		System.out.println(uname);
	}

}
