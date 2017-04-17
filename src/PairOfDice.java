
public class PairOfDice {
	private int die1;
	private int die2;
	private int sum;
	
	
	public PairOfDice(){       // Constructor.  Rolls the dice, so that they initially							
		roll();                // show some random values by calling the roll method. Default to six-sided dice

	}
	
	public PairOfDice(int sides){     // allow a variable number of sides
		
	}
	public void roll(){
		die1 = (int)(Math.random()*6) + 1; //random roll of each die
        die2 = (int)(Math.random()*6) + 1; 
	}
	public int getValue1()          //get value of die1
	{
		
		return die1;
	}
	public int getValue2()         //get value of die2
	{
		
		return die2;
		
	}
	public int getSum()
	{
		
		sum = die1 + die2;         //get sum of both dice
		return sum;
		
	}

}
