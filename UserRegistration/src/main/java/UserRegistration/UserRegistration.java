package UserRegistration;

public class UserRegistration {
	
	public String message;
	public boolean checkFirstName(String firstName) throws CustomException
	{
		if(PatternDeclarations.matchPattern(PatternDeclarations.firstNamePattern, firstName))
			{
				System.out.println("Proceed.");
				return true;
			}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid First Name!!!");
	}	
	
	public boolean checkLastName(String lastName) throws CustomException
	{
		if(PatternDeclarations.matchPattern(PatternDeclarations.lastNamePattern, lastName))
		{
			System.out.println("Proceed.");
			return true;
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Last Name!!!");
	}	

	public boolean checkEmail(String email) throws CustomException
	{
		if(PatternDeclarations.matchPattern(PatternDeclarations.emailPattern, email))
		{
			System.out.println("Proceed.");
			return true;
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Email ID!!!");
	}	

	public boolean checkPhoneNumber(String phoneNumber) throws CustomException
	{
		if(PatternDeclarations.matchPattern(PatternDeclarations.phoneNumberPattern, phoneNumber))
		{
			System.out.println("Proceed.");
			return true;
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Phone Number!!!");
	}	

	public boolean checkPassword(String password) throws CustomException
	{
		if(PatternDeclarations.matchPattern(PatternDeclarations.passwordPattern, password))
		{
			System.out.println("Proceed.");
			return true;
		}
		throw new CustomException(CustomException.ExceptionType.WRONG_INPUT_PRESENT,"Invalid Password!!!");
	}
}