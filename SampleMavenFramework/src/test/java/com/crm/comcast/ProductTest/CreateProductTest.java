package com.crm.comcast.ProductTest;

import org.testng.annotations.Test;

public class CreateProductTest 
{
	@Test(groups = "smokeTest")
	public void createProductWithNameTest()
	{
		String browser = System.getProperty("browser");
		String environment = System.getProperty("env");
		
		System.out.println("Browser ===>"+browser);
		System.out.println("Environment ===>"+environment);
		System.out.println("execute createProductWithNameTest ");
	}
	
	@Test(groups = "regressionTest")
	public void createProductWithIDTest()
	{
		System.out.println("execute createProductWithIDTest ");
	}
}
