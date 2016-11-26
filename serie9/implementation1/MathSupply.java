package serie9.implementation1;

import java.util.ArrayList;

public class MathSupply {
	
	public static double compareAverage(ArrayList<Double> list1, ArrayList<Double> list2){
		
		double avg1 = computeAvg(list1);
		double avg2 = computeAvg(list1);
		if(avg1 > avg2)
			return avg1;
		else
			return avg2;
	}

	private static double computeAvg(ArrayList<Double> list) {
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++)
			sum+= list.get(i);
		
		if(list.size() > 0)
		return sum / list.size();
		else return sum;
	}
	
	public static void main(String[] args){
	ArrayList<Double> l1 = new ArrayList<Double>();
	ArrayList<Double> l2 = new ArrayList<Double>();
	l1.add(3.0);
	l1.add(4.0);
	l1.add(5.0);
	l2.add(-4.0);
	
	System.out.println(MathSupply.compareAverage(l1, l2));
	}

}
