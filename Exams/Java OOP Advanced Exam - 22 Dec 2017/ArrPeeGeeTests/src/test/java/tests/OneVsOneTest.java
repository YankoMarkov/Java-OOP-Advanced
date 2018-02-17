package tests;

import app.contracts.Action;
import app.contracts.Targetable;
import app.models.actions.OneVsOne;
import app.models.participants.Warrior;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OneVsOneTest {
	
	private Action underTest;
	
	@Before
	public void init() {
		underTest = new OneVsOne();
	}
	
	@Test
	public void executeActionPlayer1Win() {
		List<Targetable> targetables = new ArrayList<>();
		Targetable p1 = new Warrior();
		Targetable p2 = new Warrior();
		p1.setName("gosho");
		p2.setName("pesho");
		targetables.add(p1);
		targetables.add(p2);
		p1.levelUp();
		
		String expectedOut = underTest.executeAction(targetables);
		
		Assert.assertThat(expectedOut, CoreMatchers.containsString("gosho is victorious!"));
	}
	
	@Test
	public void executeActionPlayer2Win() {
		List<Targetable> targetables = new ArrayList<>();
		Targetable p1 = new Warrior();
		Targetable p2 = new Warrior();
		p1.setName("gosho");
		p2.setName("pesho");
		targetables.add(p1);
		targetables.add(p2);
		p2.levelUp();
		
		String expectedOut = underTest.executeAction(targetables);
		
		Assert.assertThat(expectedOut, CoreMatchers.containsString("pesho is victorious!"));
	}
	
	@Test
	public void executeActionNull() {
		List<Targetable> targetables = new ArrayList<>();
		
		String expectedOut = underTest.executeAction(targetables);
		
		Assert.assertThat(expectedOut, CoreMatchers.containsString("There should be exactly 2 participants for OneVsOne!"));
	}
}