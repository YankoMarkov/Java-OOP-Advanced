package kingsGambit.models.contracts;

import kingsGambit.events.UnderAttackEvent;

public interface UnderAttackListener {
	void handleUnitAttacked(UnderAttackEvent event);
}
