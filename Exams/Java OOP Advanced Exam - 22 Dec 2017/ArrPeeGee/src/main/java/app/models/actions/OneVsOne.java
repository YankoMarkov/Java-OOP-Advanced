package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;

import java.util.List;

public class OneVsOne implements Action {
	
	public String executeAction(List<Targetable> participants) {
		
		String fight;
		String error = "There should be exactly 2 participants for OneVsOne!";
		
		if (participants.size() != 2) {
			return error;
		}
		StringBuilder sb = new StringBuilder();
		Targetable firstHero = participants.get(0);
		Targetable secondHero = participants.get(1);
		
		while (firstHero.isAlive()) {
			fight = firstHero.attack(secondHero);
			if (fight != null) {
				sb.append(fight).append(System.lineSeparator());
			}
			if (secondHero.isAlive()) {
				fight = secondHero.attack(firstHero);
				if (fight != null) {
					sb.append(fight).append(System.lineSeparator());
				}
			} else {
				break;
			}
		}
		
		if (firstHero.isAlive()) {
			sb.append(String.format("%s is victorious!%n", firstHero.getName()));
			sb.append(firstHero.toString());
		} else {
			sb.append(String.format("%s is victorious!%n", secondHero.getName()));
			sb.append(secondHero.toString());
		}
		return sb.toString();
	}
}
