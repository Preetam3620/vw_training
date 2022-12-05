package propertyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Datex
{
	

	@Value("${creation.date}")
	private int date;
	

	@Value("${creation.month}")
	private int month;
	
	
//	@Value("#{new Integer('${birthdate.year}')}")
	@Value("${creation.year}")
	private int year;

	public Datex()
	{ 
		System.out.println("inside default constructor BirthDate()");	
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


	public void setMonth(int month)
	{
		this.month = month;
	}

    public void setDate(int date)
	{
		this.date = date;
	}

    public void setYear(int year)
	{
		this.year = year;
	}

	public String toString()
	{
		return "Date: " + getDate() + "Month: " + getMonth() + "Year: " + getYear();  
	}
}
