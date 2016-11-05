package serie5.implementation4;

import serie4.Dice;

public class PairOfDice {

	private Dice dice1, dice2;
	
	public PairOfDice()
	{
		dice1 = new Dice();
		dice2 = new Dice();
	}
	
	public void setFaceValue(int value1, int value2)
	{
		dice1.setFaceValue(value1);
		dice2.setFaceValue(value2);
	}
	
	public void roll(){
		dice1.roll(); dice2.roll();
	}
	
	public String toString(){ return "\n"+Integer.toString(dice1.getFaceValue())+"|"+Integer.toString(dice2.getFaceValue()); }
	
	public static void main(String[] args) {
		PairOfDice pod1 = new PairOfDice();
		PairOfDice pod2 = new PairOfDice();
		
		pod1.roll();
		pod2.roll();
	
		System.out.print(pod1.toString() + pod2);

	}

}
