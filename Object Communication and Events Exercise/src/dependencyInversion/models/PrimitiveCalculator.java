package dependencyInversion.models;

import dependencyInversion.models.strategies.AdditionStrategy;
import dependencyInversion.models.strategies.CalculationStrategy;

public class PrimitiveCalculator {
	private CalculationStrategy strategy;
	
	public PrimitiveCalculator(){
		this.strategy = new AdditionStrategy();
	}
	
	public PrimitiveCalculator(CalculationStrategy strategy){
		this.strategy = strategy;
	}
	
	public void changeStrategy(CalculationStrategy strategy){
		this.strategy = strategy;
	}
	
	public int performCalculation(int firstOperand,int secondOperand){
		return this.strategy.calculate(firstOperand,secondOperand);
	}
}
