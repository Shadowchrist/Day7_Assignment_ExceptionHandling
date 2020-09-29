package com.javapractice;

@SuppressWarnings("serial")
public class CustomException extends Exception
{
	ExceptionType type=null;
	
	enum ExceptionType
	{
		NULL_INPUT, WRONG_INPUT_PRESENT;
	}
	public CustomException(ExceptionType type, String message)
	{
		super(message);
		this.type=type;
	}
}
