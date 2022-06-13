package org.test;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Hotal extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
		implicityWait(10);
		System.out.println("beforeClass");

	}	
		
	@AfterClass
	private void afterClass() {
//		quit();
		System.out.println("afterClass");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
		Date d=new Date();
		System.out.println("start time"+d);
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("End time"+d);
	}

	@Test
	public void test1() {
		WebElement txtusername = findElement("id","username");
		sendkeys(txtusername,"saimagesh98");
		
		WebElement txtpassword = findElement("id","password");
		sendkeys(txtpassword,"2T0U12");
		
		WebElement btnLogin = findElement("id","login");
		buttonClick(btnLogin);
		
		WebElement location = findElement("id","location");
		buttonClick(location);
		SelectByIndex(location,2);
		
		WebElement hotels = findElement("id","hotels");
		buttonClick(hotels);
		
		SelectByIndex(hotels,2);
		
		
		WebElement roomType = findElement("id","room_type");
		buttonClick(roomType);
		SelectByIndex(roomType,2);
		
		WebElement roomNos = findElement("id","room_nos");
		buttonClick(roomNos);
		SelectByIndex(roomNos,2);
		
		WebElement checkIn = findElement("id","datepick_in");
		sendkeys(checkIn,"10/06/2022");
		
		WebElement checkOut = findElement("id","datepick_in");
		sendkeys(checkOut,"13/06/2022");
		

		WebElement adults = findElement("id","adult_room");
		buttonClick(adults);
		SelectByIndex(adults,2);
		
		WebElement childs = findElement("id","child_room");
		buttonClick(childs);
		SelectByIndex(childs,1);
		
		WebElement search = findElement("id","Submit");
		buttonClick(search);
		
		System.out.println("test1");
	}
	
	@Test
	private void test2() {
		

	}
	

	 
}
