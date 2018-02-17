package kingsGambit.models;

import kingsGambit.events.UnderAttackEvent;

public class Footman extends Soldier{
	public Footman(String name) {
		super(name);
	}
	
	@Override
	public void handleUnitAttacked(UnderAttackEvent event) {
		System.out.println(String.format("Footman %s is panicking!",this.getName()));
	}
}
