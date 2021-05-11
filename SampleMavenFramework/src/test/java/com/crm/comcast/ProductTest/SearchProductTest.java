package com.crm.comcast.ProductTest;

import org.testng.annotations.Test;

public class SearchProductTest 
{
	@Test(groups = "smokeTest")
	public void SearchProductWithNameTest()
	{
		System.out.println("execute SearchProductWithNameTest ");
	}
	
	@Test(groups = "regressionTest")
	public void SearchProductWithIDTest()
	{
		System.out.println("execute cSearchProductWithIDTest ");
	}
}
