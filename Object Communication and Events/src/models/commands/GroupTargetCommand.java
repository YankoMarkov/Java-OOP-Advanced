package models.commands;

import interfaces.AttackGroup;
import interfaces.commands.Command;
import interfaces.observers.ObservableTarget;

public class GroupTargetCommand implements Command {
	
	private ObservableTarget target;
	private AttackGroup group;
	
	public GroupTargetCommand(AttackGroup group, ObservableTarget target) {
		this.target = target;
		this.group = group;
	}
	
	@Override
	public void execute() {
		group.groupTarget(target);
	}
}
