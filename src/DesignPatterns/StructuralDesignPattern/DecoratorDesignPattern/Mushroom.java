package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{

	BasePizza basePizza;
	
	public Mushroom(BasePizza pizza) {
		this.basePizza=pizza;
	}
	@Override
	int cost() {
		
		return this.basePizza.cost()+10;
	}
}
