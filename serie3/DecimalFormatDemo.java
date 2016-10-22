package serie3;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		df.applyPattern("0.##");
		System.out.println(df.format(99.0158)); // 99.02
		
		df.applyPattern("0.###");
		System.out.println(df.format(99.0158)); // 99.016

	}

}
