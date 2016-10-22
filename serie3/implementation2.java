package serie3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class implementation2 {

	public static void main(String[] args) {
		Random r = new Random();
		DecimalFormat df1 = new DecimalFormat("000");
		DecimalFormat df2 = new DecimalFormat("00");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(r.nextInt(1000));
		al.add(r.nextInt(1000));
		al.add(r.nextInt(100));
		al.add(r.nextInt(100));
		
		while(al.get(1) > 850)
		{
			al.set(1, r.nextInt(1000));
		}
		
		String s = "-";
		
		System.out.print(
				  df1.format(al.get(0))
				+ s
				+ df1.format(al.get(1))
				+ s
				+ df2.format(al.get(2))
				+ s
				+ df2.format(al.get(3)));
	}

}
