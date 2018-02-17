package militaryElite;

import militaryElite.interfaces.*;
import militaryElite.models.*;

import java.util.HashMap;
import java.util.Map;

public class CommandInterpretation {
	
	private Map<String, ISoldier> soldiers;
	
	public CommandInterpretation() {
		this.soldiers = new HashMap<>();
	}
	
	public void createSoldier(String[] input) {
		String type = input[0];
		String id = input[1];
		String firstName = input[2];
		String lastName = input[3];
		Double salary;
		String corp;
		
		switch (type) {
			case "Private":
				salary = Double.valueOf(input[4]);
				ISoldier soldier = new Private(id, firstName, lastName, salary);
				this.soldiers.putIfAbsent(id, soldier);
				System.out.println(soldier.toString().trim());
				break;
			case "Spy":
				int codeNumber = Integer.parseInt(input[4]);
				ISoldier spy = new Spy(id, firstName, lastName, codeNumber);
				System.out.println(spy.toString().trim());
				break;
			case "LeutenantGeneral":
				salary = Double.valueOf(input[4]);
				ILieutenantGeneral lieutenantGeneral = new LeutenantGeneral(id, firstName, lastName, salary);
				for (int i = 5; i < input.length; i++) {
					lieutenantGeneral.addPrivate(this.soldiers.get(input[i]));
				}
				System.out.println(lieutenantGeneral.toString().trim());
				break;
			case "Engineer":
				salary = Double.valueOf(input[4]);
				corp = input[5];
				IEngineer engineer = new Engineer(id, firstName, lastName, salary, corp);
				for (int i = 6; i < input.length; i += 2) {
					String repairName = input[i];
					int hours = Integer.valueOf(input[i + 1]);
					IRepair repair = new Repair(repairName, hours);
					engineer.addRepair(repair);
				}
				System.out.println(engineer.toString().trim());
				break;
			case "Commando":
				salary = Double.valueOf(input[4]);
				corp = input[5];
				ICommando commando = new Commando(id, firstName, lastName, salary, corp);
				for (int i = 6; i < input.length; i += 2) {
					String codeName = input[i];
					try {
						String state = input[i + 1];
						IMission mission = new Mission(codeName, state);
						commando.addMission(mission);
					} catch (IllegalArgumentException e) {
					}
				}
				System.out.println(commando.toString().trim());
				break;
			default:
				break;
		}
	}
}
