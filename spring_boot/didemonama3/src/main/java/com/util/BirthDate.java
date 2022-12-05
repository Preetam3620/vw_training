package com.util;

public class BirthDate
{
	private int date;
	private int month;
	private int year;

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
