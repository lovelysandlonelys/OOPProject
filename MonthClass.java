package maintaincontrolpackage;
//need to include FreeTime class
import FreeTime;	//syntax???????
//Classes added to work with Month objects.
import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class MonthClass {

	//Month class attributes.
	private int month;
	private int year;
	private int numberOfDaysInMonth;
	private boolean leapYear;
	private FreeTime monthFreeTime;
	
	//Constructor.
	public MonthClass()
	{
		month = 1;
		year = 1;
		numberOfDaysInMonth = 1;
		leapYear = false;
		monthFreeTime = 0;
		
		/*NOTE FOR V2:
		 * might be a good idea to set system month and year in the constructor.
		 */
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
	public int getNumberOfDaysInMonth(int month, int year)
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
	public void setNumberOfDaysInMonth()
	{
		numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
	}
	
	//getMonth() function
	//parameters: none
	//return value: int
	//returns the int value of class attribute month.
	public int getMonth()
	{
		return month;
	}
	
	//setMonth() function
	//parameters: none
	//return value: void
	//sets the month attribute to the integer value of MONTH (+1) in the current system time.
	public void setMonth()
	{
		month = (Calendar.getInstance().get(Calendar.MONTH))+1;
		//MONTH in the Calendar class ranges from 0-11, with 0 being January and 11 being December. 
		//Month in the Month class ranges from 1-12, with 1 being January and 12 being December.
		//the "+1" here adjusts the month attribute to reflect the range used in the Month class
		// because that is how the value will be used in the displayMonthName() method of the MonthClass class.
	}
	
	
	//displayMonth() function
	//parameters: int month
	//return value: Month (of Month class, comes with Java)
	//displays the name of the month. 
	public Month displayMonthName(int month)
	{
		return Month.of(month);	
		//NOTE FOR SAVANNAH ONLY:
		//I'm not sure if this is what you meant by displayMonth() in the UML.
		//I did it this way to be more compatible with the View class later. 
		//IT CAN ALWAYS BE CHANGED. Don't even worry. <3	-Lauren
	}
	
	
	//getFreeTime() function
	//parameters: none
	//return value: FreeTime object of the FreeTime class
	//returns free time for a month through monthFreeTime, an object of the FreeTime class.
	FreeTime getFreeTime()
	{
		return monthFreeTime;
		//this MIGHT need access to the int value of month, which is fine.
		//refer to setMonth() function comments to make most informed decision
		// about how to access that value.
	}
}
