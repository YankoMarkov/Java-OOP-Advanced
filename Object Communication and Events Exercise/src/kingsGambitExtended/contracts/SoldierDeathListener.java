package kingsGambitExtended.contracts;

import kingsGambitExtended.events.SoldierDeathEvent;

public interface SoldierDeathListener {
	void handleSoldierDeath(SoldierDeathEvent event);
}
