package maintaincontrolpackage;

public class FreeTime {
	
// Private class attributes:
	
	private float timeUsed;
	private float timeFree;
	
// Public class methods:
	
	// 	Default constructor
	public FreeTime() {
		timeFree = 24.0f; // By default, you have 24 hours of timeFree
		timeUsed = 0.0f; // By default, you have used 0 hours used up. 
	}
	
	// Non-default constructor for setting particular values for timeFree or timeUsed
	public FreeTime(float timeFree, float timeUsed) {
		this.timeFree = timeFree;
		this.timeUsed = timeUsed;
	}
	//passed array of days for new constructor
	
// TimeUsed setters/getters/assisting methods
	
	public float getTimeUsed() {
		return timeUsed;
	}
	
	public void setTimeUsed(float timeUsed) {
		this.timeUsed = timeUsed;
	}
	
	public void addTimeUsed(float timeUsed) {
		this.timeUsed = this.timeUsed + timeUsed; // This way, if the user adds an event to the calendar, the timeUsed is
												  // ADDED to the total timeUsed and doesn't simply REPLACE it
	}
	
	public void minusTimeUsed(float timeUsed) {
		this.timeUsed = this.timeUsed - timeUsed; // May be utilized if a user deletes an event
	}
	
// TimeFree setters/getters/assisting methods
	
	public float getTimeFree() {
		return timeFree;
	}
	
	public void setTimeFree(float timeFree)  {
		this.timeFree = timeFree; 
	}
	
	public void addTimeFree(float timeFree) {
		this.timeFree = this.timeFree + timeFree; // Similar case as above. Only works if the user is removing an event. If
		  										  // the user adds an event, timeFree should DECREASE.
	}
	
	public void minusTimeFree(float timeFree) {
		this.timeFree = this.timeFree - timeFree; // Called if the user adds an event to their calendar.
	}
	
// Display the users 
	public void displayTimeFree() {
		System.out.println("You have " + timeFree + "hours of free time.");
	}
}
