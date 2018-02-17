package weekdays;

public interface InterfaceWeeklyCalendar {
	
	void addEntry(String weekday, String notes);
	
	Iterable<WeeklyEntry> getWeeklySchedule();
}
