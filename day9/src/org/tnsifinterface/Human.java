package org.tnsifinterface;

public class Human implements ColdDrink,AlcoholDrink{

	@Override
	public void showDrink() {
		// TODO Auto-generated method stub
		System.out.println(ColdDrinkName+" "+alcoholtype + " "+brand);
		
	}

}
