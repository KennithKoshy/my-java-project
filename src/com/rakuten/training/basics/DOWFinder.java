package com.rakuten.training.basics;
public class DOWFinder
{
	public String findDOW(int day,int month,int year)
	{
		int days = year - 1900;
		if (year % 4 == 0 && month < 3)
		{
			int leap = (days / 4) - 1;
			days = days + leap;
		}
		else
		{
			int leap = (days / 4);
			days = days + leap;
		}
		for(int i = 1; i <= month; i++)
		{
			if(i == 2)
			{
				days = days + 28;
			}
			else if(i == 4 || i == 6 || i == 9 || i == 11)
			{
				days = days + 30;
			}
			else
			{
				days = days + 31;
			}
		}
		int date = days % 7;
		String dayOfWeek = "";
		switch(date)
		{
		case 0:
			dayOfWeek = "Sunday";
			break;
		case 1: 
			dayOfWeek = "Monday";
			break;
		case 2: 
			dayOfWeek = "Tuesday";
			break;
		case 3: 
			dayOfWeek = "Wednesday";
			break;
		case 4: 
			dayOfWeek = "Thursday";
			break;
		case 5: 
			dayOfWeek = "Friday";
			break;
		case 6: 
			dayOfWeek = "Saturday";
			break;
		default:
			dayOfWeek = "Invalid Date";
			break;
		}
		return dayOfWeek;
	}
	public static void main(String[] args)
	{
		DOWFinder finder = new DOWFinder();
		String dow = finder.findDOW(16,2,2021);
		System.out.println(dow);
	}
}