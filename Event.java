package maintaincontrolpackage;

// I see this class being utilized each time the user would like to add an event. Once they wish to add an event, we can 
// ask the user for the private attributes

// How the following will interact with the GUI is currently unknown. We may have to add statements like "The event name has been updated." 
// into the actual functions themselves below.
public class Event {
	
// Class attributes
	private String name;
	private float time; // Presumably in hours
	private String description;
	private String location;
	
// Class methods
	
	// Constructor
	public Event() {
		name = "N/A";
		time = 0.0f;
		description = "N/A";
		location = "N/A";
	}

// Name attribute setters/getters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
// Time attribute setters/getters
	
	public float getTime() {
		return time;
	}
	
	public void setTime(float time) {
		this.time = time;
	}
	
// Description attribute setter/getters
	
	public String getDescription() {
		return description;
	}
	
	// When inputting the description, make sure the input can account for spaces and not just singular words (syntax note for later)
	public void setDescription(String description) {
		this.description = description;
	}
	
// Location attribute setter/getters
	
    // When inputting the location, make sure the input can account for spaces and not just singular words (syntax note for later)
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	

// Displays event information:
	public void displayEvent() {
		System.out.println("Event: " + name);
		System.out.println("Time of event: " + time);
		System.out.println("Event description: " + description);
		System.out.println("Event location: " + location);
	}
}
