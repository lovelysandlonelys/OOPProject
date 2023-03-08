package maintaincontrolpackage;

public class FreeTime {
	
// Private class attributes:
	
	private float timeUsed;
	private float timeFree;
	
// Public class methods:
	
	// 	Default constructor
	public FreeTime() {
		timeFree = 24; // By default, you have 24 hours of timeFree
		timeUsed = 0; // By default, you have used 0 hours up. 
	}
	
// TimeUsed setters/getters
	
	public float getTimeUsed() {
		return timeUsed;
	}
	
	public void setTimeUsed(float timeUsed) {
		this.timeUsed = timeUsed;
	}
	
	
	
	

}
