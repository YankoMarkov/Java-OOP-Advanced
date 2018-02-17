package app.core;

import app.contracts.*;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class BattlefieldImplementation implements Battlefield {
	
	private Map<String, Targetable> participants;
	private List<Action> executedActions;
	private TargetableFactory targetableFactory;
	private ActionFactory actionFactory;
	
	public BattlefieldImplementation(TargetableFactory targetableFactory, ActionFactory actionFactory) {
		this.participants = new LinkedHashMap<>();
		this.executedActions = new LinkedList<>();
		this.targetableFactory = targetableFactory;
		this.actionFactory = actionFactory;
	}
	
	@Override
	public void createAction(String actionName, String... participantNames) {
		try {
			Action action = actionFactory.create(actionName, participantNames);
			
			List<Targetable> actionParticipants = new ArrayList<>();
			for (String name : participantNames) {
				if (this.participants.containsKey(name)) {
					actionParticipants.add(this.participants.get(name));
				} else {
					System.out.println(String.format("%s is not on the battlefield. %s failed.", name, actionName));
					return;
				}
			}
			String executeAction = action.executeAction(actionParticipants);
			if (executeAction != null) {
				System.out.println(executeAction);
			}
			checkForDeadParticipants();
			this.executedActions.add(action);
		} catch (Exception e) {
			System.out.println("Action does not exist.");
		}
	}
	
	@Override
	public void createParticipant(String name, String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		
		if (this.participants.containsKey(name)) {
			System.out.println("Participant with that name already exists.");
			return;
		}
		Targetable targetable;
		
		switch (className) {
			case "Warrior":
			case "Wizard":
			case "Necromancer":
			case "Boss":
				targetable = this.targetableFactory.create(name, className);
				this.participants.put(targetable.getName(), targetable);
				System.out.println(
						String.format("%s %s entered the battlefield.",
								targetable.getClass().getSimpleName(),
								targetable.getName()));
				break;
			default:
				System.out.println("Participant class does not exist.");
				break;
		}
	}
	
	@Override
	public void createSpecial(String name, String specialName) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void reportParticipants() {
		
		if (this.participants.size() < 1) {
			System.out.println("There are no participants on the battlefield.");
			return;
		}
		for (String name : this.participants.keySet()) {
			System.out.println(this.participants.get(name).toString());
			System.out.println("* * * * * * * * * * * * * * * * * * * *");
		}
	}
	
	@Override
	public void reportActions() {
		
		if (this.executedActions.size() < 1) {
			System.out.println("There are no actions on the battlefield.");
			return;
		}
		for (Action executedAction : executedActions) {
			System.out.println(executedAction.getClass().getSimpleName());
		}
	}
	
	private void checkForDeadParticipants() {
		
		Map<String, Targetable> aliveParticipants = new TreeMap<>();
		
		for (String name : this.participants.keySet()) {
			if (!this.participants.get(name).isAlive()) {
				System.out.println(String.format("%s has been removed from the battlefield.", name));
			} else {
				aliveParticipants.put(name, this.participants.get(name));
			}
		}
		this.participants = aliveParticipants;
	}
}
