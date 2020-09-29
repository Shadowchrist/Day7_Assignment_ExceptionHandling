package com.javapractice;
import java.util.*;
public class MoodAnalyser {

	private static String message;
	
	public MoodAnalyser(String message) {
		MoodAnalyser.message = message;
	}

	public static String analyseMood() 
	{
		message=message.toUpperCase();
		if(message.contains("SAD"))
			return "SAD";
		else
			return "HAPPY";	
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter mood message: ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		@SuppressWarnings("unused")
		MoodAnalyser mood=new MoodAnalyser(text);
		System.out.println(MoodAnalyser.analyseMood());
	}
}
