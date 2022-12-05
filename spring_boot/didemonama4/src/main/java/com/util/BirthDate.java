package com.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BirthDate
{
	@Value("${birthdate.date}")
	private int date;
	
	@Value("${birthdate.month}")
	private int month;
	
	@Value("${birthdate.year}")
	private int year;

	public BirthDate()
	{
		
	}
	public BirthDate(int date,int month, int year)
	{ 
		System.out.println("inside constructor BirthDate(int,int,int)");
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getMonth()
	{
		return this.month;
	}
	public int getDate()
	{
		return this.date;
	}
	public int getYear()
	{
		return this.year;
	}

	public String toString()
	{
		return "Date: " + getDate() + "Month: " + getMonth() + "Year: " + getYear();  
	}
}
