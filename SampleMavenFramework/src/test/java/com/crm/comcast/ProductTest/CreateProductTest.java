package com.crm.comcast.ProductTest;

import org.testng.annotations.Test;

public class CreateProductTest 
{
	@Test(groups = "smokeTest")
	public void createProductWithNameTest()
	{
		System.out.println("execute createProductWithNameTest ");
	}
	
	@Test(groups = "regressionTest")
	public void createProductWithIDTest()
	{
		System.out.println("execute createProductWithIDTest ");
	}
}
