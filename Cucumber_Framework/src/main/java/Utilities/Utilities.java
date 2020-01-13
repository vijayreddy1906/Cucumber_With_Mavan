package Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Utilities {
	@Before
	public void startup(){
		System.out.println("start");
	}
	
	@After
	public void teardoun(){
		System.out.println("END");
	}
}
