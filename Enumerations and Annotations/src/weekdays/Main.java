package weekdays;

public class Main {
	
	public static void main(String[] args) {
		WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
		
		weeklyCalendar.addEntry("Friday", "Sleep");
		weeklyCalendar.addEntry("Monday", "Sport");
		
		Iterable<WeeklyEntry> shedule = weeklyCalendar.getWeeklySchedule();
		
		for (WeeklyEntry weeklyEntry : shedule) {
			System.out.println(weeklyEntry);
		}
	}
}
