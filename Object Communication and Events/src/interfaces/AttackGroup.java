package interfaces;

import interfaces.observers.ObservableTarget;

public interface AttackGroup {
	
	void addMember(Attacker attacker);
	void groupTarget(ObservableTarget target);
	void groupAttack();
}
