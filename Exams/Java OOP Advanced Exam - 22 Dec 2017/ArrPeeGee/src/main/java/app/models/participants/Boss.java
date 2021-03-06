package app.models.participants;

import app.contracts.Targetable;
import app.models.Config;

public class Boss implements Targetable {
	
	private String name;
	private double health;
	private double damage;
	private boolean isAlive;
	private double gold;
	
	public Boss() {
		this.setHealth(Config.BOSS_HEALTH);
		this.setDamage(Config.BOSS_DAMAGE);
		this.isAlive = true;
		this.setGold(Config.BOSS_GOLD);
	}
	
	@Override
	public double getDamage() {
		return this.damage;
	}
	
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	@Override
	public boolean isAlive() {
		return this.getHealth() > 0;
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
	public double getHealth() {
		return this.health;
	}
	
	@Override
	public void setHealth(double health) {
		this.health = health;
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
		
		if (!target.isAlive()) {
			this.levelUp();
			target.giveReward(this);
			result = String.format(" %s has been slain by %s.", target.getName(), this.getName());
		}
		return result;
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
	public void receiveReward(double reward) {
		this.setGold(this.getGold() + (reward * 0.1));
	}
	
	@Override
	public void levelUp() {
		this.setHealth(Config.BOSS_HEALTH);
	}
}
