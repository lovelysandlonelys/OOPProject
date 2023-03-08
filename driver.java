package myjavapackage;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		//Testing Month class
		Month m1=new Month();
		System.out.println("Number of days: "+m1.getnumOfDays());
		System.out.println("Weeks: "+m1.getWeeks());
		System.out.println("Free time available: "+m1.getFreeTime());
		m1.displayWeek();
		m1.displayMonth();
		
		//Testing Day class
		Day d1=new Day();
		System.out.println("Free time available: "+d1.getFreeTime());
		d1.displayDay();
		d1.addEvent();
		
		
		//Testing Week class
		Week w1=new Week();
		System.out.println("Free time available: "+w1.getFreeTime());
		
		
		//Testing Event class and making sure the function work correctly
		Event e1=new Event();
		Event e2=new Event();
		e1.setName("Graduation Ceremony");
		e1.setTime(6);
		e1.setDescription("Event actually starts at 6:30");
		e1.setLocation("TBA");
		e1.displayEvent();
		
		
		//Testing FreeTime class
		FreeTime object1=new FreeTime();
		FreeTime object2=new FreeTime();
		System.out.println("Free time available "+object1.getTimeFree());
		object1.displayTimeFree();
		
		object2.minusTimeFree(15);
		object2.displayTimeFree();
		
		
		//Testing ToDoList
		ToDoList a1=new ToDoList();
		a1.addUnfinishedTask();
		a1.deleteTask();
		
		//Testing UnfinishedToDo class
		UnfinishedToDo obj1=new UnfinishedToDo();
		obj1.changeTask("Do Laundry");
		obj1.deleteTask();
		
		//Testing FinishedToDo Class
		FinishedToDo d1=new UnfinishedToDo();
		d1.deleteTask();
		
	
		//Testing View Class
		View v1=new View();
		v1.displayMonthly();
		v1.displayWeekly();
		v1.displayDaily();
	}

}
