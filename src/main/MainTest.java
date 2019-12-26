package main;

import java.util.Scanner;

import org.testng.annotations.Test;

import TestNG.TestAccountChange;
import TestNG.TestCart;
import TestNG.TestHomePage;
import TestNG.TestPetStoreMenu;
import TestNG.TestRegistration;

public class MainTest {
  @Test
  public void PetStoreTests() {
	  Scanner sc = new Scanner(System.in); 
	  int val = 0;
	  while (val != -1) {
		
		System.out.println("Please choose the test by entering corresponding number or -1 to exit"); 
		System.out.println("1 - Enter Home Page test"); 
		System.out.println("2 - Test Left Pet Store Links"); 
		System.out.println("3 - Test Top Pet Store Links"); 
		System.out.println("4 - Test Mid Pet Store Links"); 
		System.out.println("5 - Test Sign In Link"); 
		System.out.println("6 - Test Registering Single User"); 
		System.out.println("7 - Test Registering Users from Excel file"); 
		System.out.println("8 - Test Registering Single Randomly Generated User"); 
		System.out.println("9 - Test Log In");
		System.out.println("10 - Test Changing Account Info");
		System.out.println("11 - Shopping Card test"); 
		
		val = sc.nextInt();

		switch (val) {
		case 1:
			TestHomePage.testEnter();
			break;
		case 2:
			TestPetStoreMenu.Test1Left();
			break;
		case 3:
			TestPetStoreMenu.Test2Top();
			break;
		case 4:
			TestPetStoreMenu.Test3Mid();
			break;
		case 5:
			TestPetStoreMenu.Test4SingIn();
			break;
		case 6:
			TestRegistration.Test1OneUser();
			break;
		case 7:
			TestRegistration.Test2ExcelUsers();
			break;
		case 8:
			TestRegistration.Test4RandomUser();
			break;
		case 9:
			TestRegistration.Test3LogIn();
			break;
		case 10:
			TestAccountChange.Test1Change();
			break;
		case 11:
			TestCart.Test1Change();
			break;
		case -1:
			break;
		default:
			System.out.println("You've entered the wrong number! Please enter numbers from 1 to 10!");
		}
  }
  }
}
