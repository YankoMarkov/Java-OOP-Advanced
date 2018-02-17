package telephony;

public class Smartphone implements Calling, Browsing {
	
	private String phoneNumber;
	private String webSite;
	
	public Smartphone(String phoneNumber, String webSite) {
		this.phoneNumber = phoneNumber;
		this.webSite = webSite;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getWebSite() {
		return webSite;
	}
	
	@Override
	public String callingOtherPhones() {
		return String.format("Calling... %s", getPhoneNumber());
	}
	
	@Override
	public String browsingInTheWorldWeb() {
		for (int i = 0; i < getWebSite().length(); i++) {
			if (Character.isDigit(getWebSite().charAt(i))) {
				return "Invalid URL!";
			}
		}
		return String.format("Browsing: %s!", getWebSite());
	}
}
