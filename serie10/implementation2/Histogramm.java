package serie10.implementation2;

import java.util.ArrayList;
import java.util.Scanner;

public class Histogramm {

	private ArrayList<Integer> ints;
	
	public Histogramm(){
		this.ints = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		Histogramm h = new Histogramm();
		h.fill();
		h.printHistogram();
	}

	private void printHistogram() {
		String range1_10=" 1 - 10: ", range11_20="11 - 20: ", range21_30="21 - 30: ", range31_40="31 - 40: ", range41_50="41 - 50: ";
		
		for(int i = 0; i < this.ints.size(); i++)
		{
			if(this.ints.get(i) <= 10)
			{
				range1_10 += "*";
			}
			else if(this.ints.get(i) > 10 && this.ints.get(i) <= 20)
			{
				range11_20 += "*";
			}
			
			else if(this.ints.get(i) > 20 && this.ints.get(i) <= 30)
			{
				range21_30 += "*";
			}
			
			else if(this.ints.get(i) > 30 && this.ints.get(i) <= 40)
			{
				range31_40 += "*";
			}
			
			else if(this.ints.get(i) > 40 && this.ints.get(i) <= 50)
			{
				range41_50 += "*";
			}
			
		}
		
		System.out.println(range1_10);
		System.out.println(range11_20);
		System.out.println(range21_30);
		System.out.println(range31_40);
		System.out.println(range41_50);
	}

	private void fill() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ganze Zahlen zwischen 1 & 50 eingeben!");
		
		int readValue = s.nextInt();
		
		while(readValue != 0)
		{
			if(readValue > 50 || readValue < 0)
			{
				System.err.println("Zahl wird nicht akzeptiert!");
				System.out.println("Weitere Zahl eingeben oder mit '0' beenden!");
				readValue = s.nextInt();
			}
			else
			{
				this.ints.add(readValue);
				System.out.println("Weitere Zahl eingeben oder mit '0' beenden!");
				readValue = s.nextInt();
			}
		}
		
		/* Debug
		for(int i = 0; i < ints.size(); i++)
			System.out.println(ints.get(i));
		*/
	}

}
