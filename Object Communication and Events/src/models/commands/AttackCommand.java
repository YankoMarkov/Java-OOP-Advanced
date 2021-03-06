package models.commands;

import interfaces.Attacker;
import interfaces.commands.Command;

public class AttackCommand implements Command {
	
	private Attacker attacker;
	
	public AttackCommand(Attacker attacker) {
		this.attacker = attacker;
	}
	
	@Override
	public void execute() {
		attacker.attack();
	}
}
