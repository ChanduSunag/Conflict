package Smaple;

import org.testng.annotations.Test;


public class SampleProductTest {


	@Test(groups = "smoke test")
	public void createProductTest() {
		System.out.println("==========product created==========");
		System.out.println("i am lohith");
	}

	@Test(groups = "regression test")
	public void editProductTest() {
		System.out.println("==========edit product==========");
		System.out.println("i am lohith");
	}
}


