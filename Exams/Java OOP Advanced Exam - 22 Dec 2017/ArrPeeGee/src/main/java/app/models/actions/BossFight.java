package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;
import app.models.Config;

import java.util.Comparator;
import java.util.List;

public class BossFight implements Action {
	
	@Override
	public String executeAction(List<Targetable> participants) {
		
		Targetable boss = null;
		
		String fight;
		String error = "There should be at least 1 participant for boss fight!";
		
		if (participants.size() < 1) {
			return error;
		}
		for (Targetable participant : participants) {
			if (participant.getClass().getSimpleName().equals("Boss")) {
				boss = participant;
				participants.remove(participant);
				if (boss.getName().equals("Boss")) {
					boss = null;
				}
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		Targetable winner = null;
		boolean heroIsAlive = true;
		
		if (boss == null) {
			return "Invalid boss.";
		} else {
			while (boss.isAlive() && participants.size() > 0 && heroIsAlive) {
				for (Targetable hero : participants) {
					if (hero.isAlive()) {
						fight = hero.attack(boss);
						if (fight != null) {
							sb.append(fight).append(System.lineSeparator());
						}
						if (boss.isAlive()) {
							fight = boss.attack(hero);
							if (fight != null) {
								sb.append(fight).append(System.lineSeparator());
							}
						} else {
							hero.receiveReward(boss.getGold());
							winner = hero;
							sb.append("Boss has been slain by: ").append(System.lineSeparator());
							break;
						}
					} else {
						heroIsAlive = false;
					}
				}
			}
		}
		if (boss.isAlive()) {
			return "Boss has slain them all!";
		} else {
			Targetable finalWinner = winner;
			participants.stream()
					.sorted(Comparator.comparing(Targetable::getName))
					.forEach(res -> {
						assert finalWinner != null;
						if (res.isAlive()) {
							if (!res.getName().equals(finalWinner.getName())) {
								res.levelUp();
							}
							res.receiveReward(Config.BOSS_INDIVIDUAL_REWARD);
							sb.append(res.toString()).append(System.lineSeparator());
						}
					});
		}
		return sb.toString().trim();
	}
}
