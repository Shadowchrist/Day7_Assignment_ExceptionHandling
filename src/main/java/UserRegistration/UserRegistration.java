package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public String message;
	public boolean checkFirstName(String firstName) throws CustomException
	{
		if(firstName.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
		{
			String regex="^[A-Z]{1}[a-zA-Z]{2,}";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(firstName);
			if(m.matches())
				{
					System.out.println("Proceed.");
					return true;
				}		
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid First Name!!!");
	}	
	
	public boolean checkLastName(String lastName) throws CustomException
	{
		if(lastName.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
		{
			String regex="^[A-Z]{1}[a-zA-Z]{2,}";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(lastName);
			if(m.matches())
			{
				System.out.println("Proceed.");
				return true;
			}		
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Last Name!!!");
	}	

	public boolean checkEmail(String email) throws CustomException
	{
		if(email.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
		{
			String regex="(?=[^@\\s]+@[^@\\s]+$)^[a-zA-Z0-9]{1,}+(([\\.+-_][a-zA-Z0-9]{1,})?)+@(?:[a-zA-Z0-9]{1,})+\\.[a-z]{2,4}+((\\.[a-z]{2})?)$";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(email);
			if(m.matches())
			{
				System.out.println("Proceed.");
				return true;
			}					
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Email ID!!!");
	}	

	public boolean checkPhoneNumber(String phoneNumber) throws CustomException
	{
		if(phoneNumber.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
			{
				String regex="^[0-9]{2,3}\\s[0-9]{10}";
				Pattern p = Pattern.compile(regex); 
				Matcher m = p.matcher(phoneNumber);
				if(m.matches())
				{
					System.out.println("Proceed.");
					return true;
				}			
			}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Phone Number!!!");
	}	

	public boolean checkPassword(String password) throws CustomException
	{
		if(password.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
		{
			String regex="^(?=.*[A-Z])(?=.*[0-9])(?=[^.,:;'!@#$%^&*_+=|]*[.,:;'!@#$%^&*_+=|][^.,:;'!@#$%^&*_+=|]*$).{8,}$";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(password);
			if(m.matches())
			{
				System.out.println("Proceed.");
				return true;
			}
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Password!!!");
	}
}