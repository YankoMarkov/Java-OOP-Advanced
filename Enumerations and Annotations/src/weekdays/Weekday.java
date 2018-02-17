package weekdays;

public enum Weekday {
	
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday");
	
	private String weekday;
	
	private Weekday(String weekday) {
		this.weekday = weekday;
	}
	
	public String getWeekday() {
		return weekday;
	}
	
	@Override
	public String toString() {
		return String.format("%s", getWeekday());
	}
}
