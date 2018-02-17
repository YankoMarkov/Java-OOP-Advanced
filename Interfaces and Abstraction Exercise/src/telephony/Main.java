package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] phoneNumber = read.readLine().split("\\s+");
		String[] webSites = read.readLine().split("\\s+");
		Smartphone smartphone = null;
		
		for (String number : phoneNumber) {
			smartphone = new Smartphone(number, null);
			System.out.println(smartphone.callingOtherPhones());
		}
		for (String webSite : webSites) {
			smartphone = new Smartphone(null, webSite);
			System.out.println(smartphone.browsingInTheWorldWeb());
		}
	}
}
