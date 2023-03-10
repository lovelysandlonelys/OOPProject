package maintaincontrolpackage;
import java.util.Calendar;
public class Day {

	private int numberOfDay;
	private float usedTime;
	private FreeTime dailyFreeTime;
	private Event[] events;
	
	//Constructor for the Day class.
	public Day()
	{
		numberOfDay = 1;
		usedTime = 0;
		dailyFreeTime = 0;
		//add a line to initialize array.
	}
	
	
	//getNumberOfDay() function
	//parameters: none
	//return value: int
	//returns the integer value stored in the Day class attribute numberOfDay.
	public int getNumberOfDay()
	{
		return numberOfDay;
	}
	
	//setNumberOfDay() function
	//parameters: int day. class attribute holding the integer value of the day in the month.
	//return value: void
	//sets Day class attribute day to the system day.
	public void setNumberOfDay(int day)
	{
		day = Calendar.DAY_OF_MONTH;	//does it need Calendar.getInstance()?
	}
	
	//getFreeTime() function
	//parameters: none
	//return value: FreeTime
	//returns the FreeTime value stored in the Day class attribute dailyFreeTime.
	public FreeTime getFreeTime()
	{
		return dailyFreeTime;
	}
	
	//displayDay() function
	//parameters: int day. attribute of the Day class holding the int value of a day.
	//return value: void
	//prints "Day: [int day]" to the screen.
	public void displayDay(int day)
	{
		System.out.println("Day: "+day);
	}
	
	public void addEvent()
	{
		//needs to work with Event class!!!!!!!!!!!
		//return value and parameters subject to change.
	}
	
	public void deleteEvent()
	{
		//needs to work with Event class!!!!!!!!!!!
		//return value and parameters subject to change.
	}
}






//Make an array of Day objects in the Day class. Holds info
