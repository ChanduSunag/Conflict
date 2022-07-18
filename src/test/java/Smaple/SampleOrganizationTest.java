package Smaple;

import org.testng.annotations.Test;


public class SampleOrganizationTest {


	@Test(groups = "smoke test")
	public void createOrganizationTest() {
	System.out.println("=========organization created==========");
	System.out.println("i am lohith");
	
	}

	@Test(groups="regression test")
	public void editOrganizationTest() {
	System.out.println("========edit organization========");
	System.out.println("i am lohith");
	
	}
}
