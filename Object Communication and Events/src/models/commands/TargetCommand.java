package models.commands;

import interfaces.Attacker;
import interfaces.commands.Command;
import interfaces.observers.ObservableTarget;

public class TargetCommand implements Command {
	
	private Attacker attacker;
	private ObservableTarget target;
	
	public TargetCommand(Attacker attacker, ObservableTarget target) {
		this.attacker = attacker;
		this.target = target;
	}
	
	@Override
	public void execute() {
		attacker.setTarget(target);
	}
}
