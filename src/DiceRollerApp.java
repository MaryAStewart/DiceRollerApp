/*Project 7-3: Roll the dice
Console
Welcome to the Paradise Roller application

Roll the dice? (y/n): y

Roll 1:
2
5
Craps!

Roll again? (y/n): y

Roll 2:
2
1

Roll again? (y/n): y

Roll 3:
4
6

Roll again? (y/n): y

Roll 4:
6
6
Box cars!

Roll again? (y/n): y

Roll 5:
1
1
Snake eyes!

Roll again? (y/n): n
Operation
•	If the user chooses to roll the dice, the application rolls two six-sided dice, displays the results of each, and asks if the user wants to roll again.
Specifications
•	Create a class named Die to store the data about each die. This class should contain these constructors and methods:
public Die()              // default to a six-sided die
public Die(int sides)     // allow a variable number of sides
public void roll()
public int getValue()
 
•	Create a class named PairOfDice to store two dice. This class should contain two instance variables of the Die type, an instance variable that holds the sum of the two dice, and these constructors and methods:
public PairOfDice()           // default to six-sided dice
public PairOfDice(int sides)  // allow a variable number of sides
public void roll()
public int getValue1()        // get value of die1
public int getValue2()        // get value of die2
public int getSum()           // get the sum of both dice
•	You can use the random method of the Math class to generate a random number from 1 to the number of sides on a die like this:
int value = (int) (Math.random() * sides);
•	Create a class named DiceRollerApp that uses the PairOfDice class to roll the dice. This class should display special messages for craps (sum of both dice is 7), snake eyes (double 1’s), and box cars (double 6’s). For this application, assume that two six-sided dice are used.
•	Create a class named Validator that contains static methods that can be used to validate the data in this application.
*/

import java.util.Scanner;
public class DiceRollerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Paradise Roller application.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		OOValidator ooval = new OOValidator(sc);
		PairOfDice dice = new PairOfDice();
		int rollCount = 0; //counts number of times the dice are rolled
		//initial input from user
		choice = ooval.getChoiceString("Roll the Dice? (y/n)", "y", "n");
		System.out.println();
		while(!choice.equalsIgnoreCase("n"))
		{
			dice.roll();
			dice.getValue1();
			dice.getValue2();
			rollCount++;
			System.out.println("Roll " + rollCount + ":");
			System.out.println(dice.getValue1());
			System.out.println(dice.getValue2());
			
			if(dice.getSum()==7)
			System.out.println("Craps!");
			if(dice.getValue1()==1 && dice.getValue2()==1)
				System.out.println("Snake Eyes!");
			if(dice.getValue1()==6 && dice.getValue2()==6)
				System.out.println("Box Car!");
			
			
			choice = ooval.getChoiceString("Roll again? (y/n)", "y", "n");			
					
		}
	}

	

}
