package kingsGambitExtended.models;

import kingsGambitExtended.contracts.SoldierDeathListener;
import kingsGambitExtended.events.SoldierDeathEvent;

import java.util.LinkedHashMap;

public class ModifiedMap<K, V> extends LinkedHashMap<K,V> implements SoldierDeathListener {
	
	@Override
	public void handleSoldierDeath(SoldierDeathEvent event) {
		this.remove(event.getName());
	}
}
