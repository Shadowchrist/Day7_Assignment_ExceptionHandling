package com.javapractice;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testSadMood() 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mood message: ");
		String text=sc.nextLine();
		MoodAnalyser moodAnalyser=new MoodAnalyser(text);
		String mood=moodAnalyser.analyseMood();
		assertEquals("SAD",mood);
 	}
	
	@Test
	public void testHappyMood() 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mood message: ");
		String text=sc.nextLine();
		MoodAnalyser moodAnalyser=new MoodAnalyser(text);
		String mood=moodAnalyser.analyseMood();
		assertEquals("HAPPY",mood);
 	}

}
