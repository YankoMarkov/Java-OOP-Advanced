package app.models.participants;

import app.contracts.Hero;
import app.contracts.Targetable;
import app.models.Config;

public abstract class BaseHero implements Hero {
	
	private String name;
	private double health;
	private boolean isAlive;
	private double gold;
	private int strength;
	private int dexterity;
	private int intelligence;
	
	protected BaseHero() {
		this.isAlive = true;
		this.setGold(Config.HERO_START_GOLD);
	}
	
	@Override
	public double getHealth() {
		return this.health;
	}
	
	@Override
	public void setHealth(double health) {
		this.health = health;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getGold() {
		return this.gold;
	}
	
	public void setGold(double gold) {
		this.gold = gold;
	}
	
	@Override
	public boolean isAlive() {
		return this.getHealth() > 0;
	}
	
	@Override
	public int getStrength() {
		return this.strength;
	}
	
	@Override
	public void setStrength(int strength) {
		this.strength = strength;
		this.setHealth(strength * Config.HERO_HEALTH_MULTIPLIER);
	}
	
	@Override
	public int getDexterity() {
		return this.dexterity;
	}
	
	@Override
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	@Override
	public int getIntelligence() {
		return this.intelligence;
	}
	
	@Override
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@Override
	public String attack(Targetable target) {
		String result = null;
		if (!this.isAlive()) {
			return this.getName() + " is dead! Cannot attack.";
		}
		if (!target.isAlive()) {
			return target.getName() + " is dead! Cannot be attacked.";
		}
		target.takeDamage(this.getDamage());
		if (!target.getClass().getSimpleName().equals("Boss")) {
			result = this.getName() + " attacked!";
		}
		if (!target.isAlive()) {
			this.levelUp();
			target.giveReward(this);
			if (!target.getClass().getSimpleName().equals("Boss")) {
				result += String.format(" %s has been slain by %s.", target.getName(), this.getName());
			}
		}
		return result;
	}
	
	@Override
	public void receiveReward(double reward) {
		this.setGold(this.getGold() + reward);
	}
	
	@Override
	public void takeDamage(double damage) {
		this.setHealth(this.getHealth() - damage);
	}
	
	@Override
	public void giveReward(Targetable targetable) {
		targetable.receiveReward(this.getGold());
		this.setGold(0);
	}
	
	@Override
	public void levelUp() {
		this.setStrength(this.getStrength() * Config.LEVEL_UP_MULTIPLIER);
		this.setDexterity(this.getDexterity() * Config.LEVEL_UP_MULTIPLIER);
		this.setIntelligence(this.getIntelligence() * Config.LEVEL_UP_MULTIPLIER);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("  Name: %s | Class: %s", this.getName(), this.getClass().getSimpleName()))
				.append(System.lineSeparator())
				.append(String.format("  Health: %.2f | Damage: %.2f", this.getHealth(), this.getDamage()))
				.append(System.lineSeparator())
				.append(String.format("  %d STR | %d DEX | %d INT | %.2f Gold", this.getStrength(), this.getDexterity(), this.getIntelligence(), this.getGold()));
		
		return sb.toString();
	}
}
