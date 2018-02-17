package tests;

import bg.softuni.utils.RegistrationTime;
import bg.softuni.utils.RegistrationTimeImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationTimeImplTest {
	
	private RegistrationTime time;
	
	@Before
	public void setUp() throws Exception {
	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getHour() {
		this.time = new RegistrationTimeImpl("73:35 18/04/2017");
		
	}
	
	@Test
	public void getMinutes() {
	}
	
	@Test
	public void getDay() {
	}
	
	@Test
	public void getMonth() {
	}
	
	@Test
	public void getYear() {
	}
}