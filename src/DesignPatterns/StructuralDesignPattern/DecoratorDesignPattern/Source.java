package DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class Source {

	 public void MainFunc() 
	 { 
	    //Maragherita Pizza with extra cheese
		BasePizza  maragheritaPizzaWithExtraChees=new ExtraCheese(new Margherita());
		
		//Maragherita Pizza with extra cheese and mushroom
		BasePizza  maragheritaPizzaWithExtraCheesAndMushroom=new Mushroom(new ExtraCheese(new Margherita()));
	 } 
}
