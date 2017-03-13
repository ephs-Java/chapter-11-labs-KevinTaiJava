package coin;

import java.util.Random;

public class Coin {
//	Note that in the Coin class, the constants HEADS and TAILS and the 
//	variable face are declared inside the class, but not inside any method. 
//	The location at which a variable is declared defines its scope, which 
//	is the area within a program in which that variable can be referenced. 
//	By being declared at the class level (not within a method), these 
//	variables and constants can be referenced in any method of the class.
	
	
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;

	// -----------------------------------------------------------------
	// Sets up the coin by flipping it initially.
	// -----------------------------------------------------------------
//	Attributes such as the variable face are also called instance data because 
//	memory space is created for each instance of the class that is created. 
//	Each Coin object, for example, has its own face variable with its own data 
//	space. Therefore at any point in time, two Coin objects can have their own 
//	states: one can be showing heads and the other can be showing tails, 
//	for instance.
	
	public Coin() {
		flip();
	}

	// -----------------------------------------------------------------
	// Flips the coin by randomly choosing a face value.
	// -----------------------------------------------------------------
	public void flip() {
		face = (int) (Math.random() * 2);
	}

	// -----------------------------------------------------------------
	// Returns true if the current face of the coin is heads.
	// -----------------------------------------------------------------
	public boolean isHeads() {
		return (face == HEADS);
	}

	// -----------------------------------------------------------------
	// Returns the current face of the coin as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}

}
