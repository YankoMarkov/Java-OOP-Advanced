package coffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
	
	private List<Coin> coins;
	private List<Coffee> coffees;
	
	public CoffeeMachine() {
		this.coins = new ArrayList<>();
		this.coffees = new ArrayList<>();
	}
	
	public void buyCoffee(String size, String type) {
		CoffeeSize coffeeSize = CoffeeSize.valueOf(size.toUpperCase());
		CoffeeType coffeeType = CoffeeType.valueOf(type.toUpperCase());
		Coffee coffee = new Coffee(coffeeSize, coffeeType);
		int price = coffee.getPrice();
		int currentSum = this.coins.stream().mapToInt(Coin::getValue).sum();
		if (currentSum >= price) {
			this.coffees.add(coffee);
			this.coins.clear();
		}
	}
	
	public void insertCoin(String coin) {
		this.coins.add(Coin.valueOf(coin.toUpperCase()));
	}
	
	public Iterable<Coffee> coffeesSold() {
		return this.coffees;
	}
}
