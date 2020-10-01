package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDeclarations {
	
	public static final String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";;
	public static final String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
	public static final String emailPattern = "(?=[^@\\s]+@[^@\\s]+$)^[a-zA-Z0-9]{1,}+(([\\.+-_][a-zA-Z0-9]{1,})?)+@(?:[a-zA-Z0-9]{1,})+\\.[a-z]{2,4}+((\\.[a-z]{2})?)$";
	public static final String phoneNumberPattern = "^[0-9]{2,3}\\s[0-9]{10}";
	public static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=[^.,:;'!@#$%^&*_+=|]*[.,:;'!@#$%^&*_+=|][^.,:;'!@#$%^&*_+=|]*$).{8,}$";

	public static boolean matchPattern(String pattern, String fieldInput) throws CustomException
	{
		if(fieldInput.length()==0)
			throw new CustomException(CustomException.ExceptionType.NULL_INPUT,"Field cannot be empty!!!");
		else
		{
			Pattern p = Pattern.compile(pattern); 
			Matcher m = p.matcher(fieldInput);
			return m.matches();
		}
	}
}
