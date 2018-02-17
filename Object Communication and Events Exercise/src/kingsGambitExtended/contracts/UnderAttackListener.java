package kingsGambitExtended.contracts;

import kingsGambitExtended.events.UnderAttackEvent;

public interface UnderAttackListener {
	void handleUnitAttacked(UnderAttackEvent event);
}
