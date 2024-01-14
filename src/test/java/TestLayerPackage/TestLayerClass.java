package TestLayerPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.CreateAccountClass;

public class TestLayerClass extends BaseClass{
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
		
	}
	
	@Test
	public  void validatecraeteAccountfunctionality()
	{
		
		CreateAccountClass craeteacount= new CreateAccountClass();
		craeteacount.createAccountfunctionality("Bhabajit","Samal","CRA","Raptim","Mumbai");
		
	}
public void tearDown() throws InterruptedException

{
	Thread.sleep(5000);
	
	
	
}
}
