package maintaincontrolpackage;

// Currently, this class works assuming the calculations for the weekly free time/time used will happen elsewhere like in Main.

// CANNOT CALCULATE THE WEEKLY EVENT FREE TIME BECAUSE I CANNOT ACCESS THE Days arrays Events array (The classes don't inherit one another
// SO I cannot use the dot operator.

// Solutions:
// 1. Inheritance
// 2. In day class, have a function that sends the events array per day to the week class for the freeTime to be added together
// 3. Entirely remove the Week class and calculate the weekly information via the amount of days in the Day class (easier access to
// member data

public class Week {

// Class attributes:
	private String name;
	private FreeTime weeklyFreeTime;
	
// Class methods:
	
	// Constructor
	public Week(Day days[]),
	{
		name = "Week 1";
		
		float total = 0.0f;
		for (int i = 0; i < days.length; i++)
		{
			total = days.
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public FreeTime getWeeklyFreeTime()
	{
		return weeklyFreeTime;
	}
	
	public void displayWeek() 
	{
		// Output the name of the week
		System.out.println(name);
		System.out.println("This weeks time free: " + freeTime.getTimeFree());
		System.out.println("This weeks time used: " + freeTime.getTimeUsed());
	}
}
