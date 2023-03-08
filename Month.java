package TimeIdentifierClasses;
//need to include Week class
//need to include FreeTime class
public class Month {

	//Month class attributes.
	private int month;
	private int year;
	private int numberOfDaysInMonth;
	private boolean leapYear;
	private FreeTime monthFreeTime;
	
	//Constructor.
	public Month()
	{
		month = 1;
		year = 1;
		numberOfDaysInMonth = 1;
		leapYear = false;
		monthFreeTime = 0;
	}
	
	//isLeapYear() function
	//parameters: int month
	//return value: boolean
	//returns true if the year is a leap year. 
	//returns false if the year is not a leap year.
	public boolean isLeapYear(int month)
	{
		if((year%100) == 0 && (year%400) == 0)	//"if the year is divisible evenly by 100 and 400..."
			return true;	//it is a leap year.
		else
			return false;	//it is not a leap year.
	}
	
	//setLeapYear() function
	//parameters: int year
	//return value: void
	//sets leapYear attribute to true or false 
	// depending on the return value of the isLeapYear() function.
	public void setLeapYear(int year)
	{
		if(isLeapYear(year) == true) //if isLeapYear() function evaluates to true...
			leapYear = true;	//it is a leap year. sets leapYear attribute to value true.
		else					//if isLeapYear() function evaluates to false...
			leapYear = false;	//it is not a leap year. sets leapYear attribute to value false.
	}
	
	//getNumberOfDaysInMonth() function
	//parameters: int month, int year.
	//return value: int
	//returns the number of days in a month based on
	// the month and the true or false status of
	// the isLeapYear() function.
	int getNumberOfDaysInMonth(int month, int year)
	{
		//returns days in February on a leap year:
		if(month == 2 && isLeapYear(year) == true)
			return 29;
		//returns days in February when it's not a leap year:
		else if(month == 2 && isLeapYear(year) == false)
			return 28;
		//returns days in months with 31 days:
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		//returns days in months with 30 days:
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		//consider adding an else case for validation outside of range 1-12.
	}
	
	//setNumberOfDaysInMonth() function.
	//parameters: none.
	//return value: void
	//sets Month class attribute numberOfDaysInMonth to
	// the return value of the function getNumberOfDaysInMonth().
	void setNumberOfDaysInMonth()
	{
		numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
	}
	
	//getMonth() function
	//parameters: none
	//return value: int
	//returns the int value of class attribute month.
	int getMonth()
	{
		return month;
	}
	
	void setMonth()
	{
		//Make work with the Calendar class.
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}




//java.util.Calendar;
//use 