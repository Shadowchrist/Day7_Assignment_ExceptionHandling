package UserRegistration;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import org.junit.Before;

public class UserRegistrationTest {

	public UserRegistration userRegistration;
	
	public UserRegistrationTest() 
	{ 
		userRegistration = new UserRegistration();
	}
	
		@Before
		public void setup() 
		{
			@SuppressWarnings("unused")
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
		}
	
		@Test
		public void validateFirstName() 
		{
			boolean result;
			try 
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a first name: ");
				String input=sc.nextLine();
				result = userRegistration.checkFirstName(input);
				assertTrue(result);
			}
			catch (CustomException ce) 
			{
				System.out.println(ce.getMessage());
				if(ce.type != null)
					fail();
			}
		}

		@Test
		public void validateLastName() 
		{
			boolean result;
			try 
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a last name");
				String input=sc.nextLine();
				result = userRegistration.checkLastName(input);
				assertTrue(result);
			}
			catch (CustomException ce) 
			{
				System.out.println(ce.getMessage());
				if(ce.type != null)
					fail();
			}
		}

		@Test
		public void validateEmail() 
		{
			boolean result;
			try 
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter an email ID: ");
				String input=sc.nextLine();
				result = userRegistration.checkEmail(input);
				assertTrue(result);
			}
			catch (CustomException ce) 
			{
				System.out.println(ce.getMessage());
				if(ce.type != null)
					fail();
			}
		}
		
		@Test
		public void validatePhoneNumber() 
		{
			boolean result;
			try 
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a phone number: ");
				String input=sc.nextLine();
				result = userRegistration.checkPhoneNumber(input);
				assertTrue(result);
			}
			catch (CustomException ce) 
			{
				System.out.println(ce.getMessage());
				if(ce.type != null)
					fail();
			}
		}
		
		@Test
		public void validatePassword() 
		{
			boolean result;
			try 
			{
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a pasword: ");
				String input=sc.nextLine();
				result = userRegistration.checkPassword(input);
				assertTrue(result);
			}
			catch (CustomException ce) 
			{
				System.out.println(ce.getMessage());
				if(ce.type != null)
					fail();
			}
		}
}
