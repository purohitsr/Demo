package com.selenium.test.DemoGitProject;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(priority=1)
	public void Test1(){
		System.out.println("In test1");
	}
	
	@Test
	public void Test2(){
		System.out.println("In test2");
	}

}
