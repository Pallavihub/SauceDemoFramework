package testLayer;

import baseLayer.BaseClass;
import pageLayer.HomePage;

public class TestClass {
	
	public static void main(String[] args) {
		
		BaseClass base=new BaseClass();
		
		base.setUp("chrome");
		
		HomePage home=new HomePage();
		
		home.validateHomePage();
	}

}
