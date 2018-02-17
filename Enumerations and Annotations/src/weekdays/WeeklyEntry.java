package weekdays;

import java.util.Comparator;

public class WeeklyEntry {
	
	public static Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByDay();
	
	private Weekday weekday;
	private String notes;
	
	public WeeklyEntry(String weekday, String notes) {
		this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
		this.notes = notes;
	}
	
	public Weekday getWeekday() {
		return weekday;
	}
	
	public String getNotes() {
		return notes;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", getWeekday(), getNotes());
	}
	
	private static Comparator<WeeklyEntry> getComparatorByDay() {
		return Comparator.comparing(d -> d.weekday);
	}
}
