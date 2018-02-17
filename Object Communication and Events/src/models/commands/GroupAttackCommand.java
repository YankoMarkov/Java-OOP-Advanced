package models.commands;

import interfaces.AttackGroup;
import interfaces.commands.Command;

public class GroupAttackCommand implements Command {
	
	private AttackGroup group;
	
	public GroupAttackCommand(AttackGroup group) {
		this.group = group;
	}
	
	@Override
	public void execute() {
		group.groupAttack();
	}
}
