package serie5;

import java.util.Random;

public class Dice {
	
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the dice

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Dice(){
      faceValue = 1;
   }
   	
   //-----------------------------------------------------------------
   //  Rolls the dice and returns the result.
   //-----------------------------------------------------------------
   public int roll(){
      faceValue = (int)(Math.random() * MAX) + 1;
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value){
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue(){
      return faceValue;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString(){
      String result = Integer.toString(faceValue);
      return result;
   }
   public int getFaceDown(){
	   return (MAX + 1) - faceValue;
   }
   
   public int coboid(int l, int b, int h)
   {
	   return l * b * h;
   }
   
   public int randomInRange(int l, int h)
   {
	   Random r = new Random();
	   return r.nextInt(h-l+1)+l;
   }
}
