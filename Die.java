import java.util.Random; //randomizer

public class Die {
	Random RNGsus = new Random(); //constructor for random
	
	private int sides; //values needed
	private int value;
	
	public Die(int sides) { //constructor for class
		this.sides = sides;
	}
	
	public void roll() { //simulate roll
		value = RNGsus.nextInt(sides) + 1;
	}
	
	public int getSides() { //number of sides
		return sides;
	}
	
	public int getValue() { //value of roll
		return value;
	}
}
