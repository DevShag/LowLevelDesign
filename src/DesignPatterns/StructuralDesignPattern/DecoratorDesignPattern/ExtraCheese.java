package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{

	BasePizza basePizza;
	
	public ExtraCheese(BasePizza pizza) {
		this.basePizza=pizza;
	}
	@Override
	int cost() {
		
		return this.basePizza.cost()+10;
	}

}
