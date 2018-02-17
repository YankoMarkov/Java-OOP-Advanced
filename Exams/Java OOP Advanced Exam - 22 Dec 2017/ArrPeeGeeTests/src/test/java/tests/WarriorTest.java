package tests;

import app.contracts.Hero;
import app.models.participants.Warrior;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WarriorTest {
	
	private Hero underTest;
	
	@Before
	public void init() {
		underTest = new Warrior();
	}
	
	@Test
	public void isAliveTrue() {
		Assert.assertTrue(underTest.isAlive());
	}
	
	@Test
	public void isAliveFalse() {
		underTest.setHealth(0);
		
		Assert.assertFalse(underTest.isAlive());
	}
	
	@Test
	public void receiveReward() {
		double gold = underTest.getGold();
		double reward = 100;
		
		underTest.receiveReward(reward);
		
		Assert.assertEquals(gold + reward, underTest.getGold(), 0.001);
	}
	
	@Test
	public void takeDamage() {
		underTest.setHealth(100);
		double damage = 10;
		
		underTest.takeDamage(damage);
		
		Assert.assertEquals(100 - damage, underTest.getHealth(), 0.001);
	}
	
	@Test
	public void giveReward() {
		Hero p = new Warrior();
		p.receiveReward(underTest.getGold());
		
		underTest.giveReward(p);
		
		Assert.assertEquals(0, underTest.getGold(), 0.001);
	}
	
	@Test
	public void levelUp() {
		int strength = underTest.getStrength();
		int dexterity = underTest.getDexterity();
		int intelligence = underTest.getIntelligence();
		
		underTest.levelUp();
		
		Assert.assertEquals(strength * 2, underTest.getStrength());
		Assert.assertEquals(dexterity * 2, underTest.getDexterity());
		Assert.assertEquals(intelligence * 2, underTest.getIntelligence());
	}
}