import models.loggers.Logger;
import interfaces.AttackGroup;
import interfaces.commands.Command;
import interfaces.commands.Executor;
import interfaces.observers.ObservableTarget;
import models.*;
import models.commands.CommandExecutor;
import models.loggers.CombatLogger;
import models.loggers.EventLogger;
import models.Group;
import models.commands.GroupAttackCommand;
import models.commands.GroupTargetCommand;

public class Main {
	public static void main(String[] args) {
		
		Logger combatLogger = new CombatLogger();
		Logger eventLogger = new EventLogger();
		//Logger targetLogger = new TargetLogger();
		
		combatLogger.setSuccessor(eventLogger);
		//eventLogger.setSuccessor(targetLogger);
		
		AttackGroup group = new Group();
		group.addMember(new Warrior("Warrior", 10 , combatLogger));
		group.addMember(new Warrior("ElderWarrior", 13, combatLogger));
		
		ObservableTarget dragon = new Dragon("Dragon", 10, 25, combatLogger);
		
		Executor commandExecutor = new CommandExecutor();
		Command groupTarget = new GroupTargetCommand(group, dragon);
		Command attackCommand = new GroupAttackCommand(group);
		
		commandExecutor.executeCommand(groupTarget);
		commandExecutor.executeCommand(attackCommand);
	}
}
