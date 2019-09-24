package test.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testn {

	@BeforeMethod
	public void before() {
	System.out.println("beforemethod");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("aftermethod");
	}
	
	@Test
	public void login() {
		System.out.println("Hello");
	}
	
	
}
