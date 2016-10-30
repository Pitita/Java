package serie3.DEMOs;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {	
		
		/* String.format Example */
		double d = 99.0158;
		System.out.println(String.format(Locale.GERMAN, "%1$,.2f", d));
		System.out.println(String.format(Locale.GERMAN, "%1$,.3f", d));System.out.println();
		
		/* getCurrency | getPercentage Example */
		
		final double TAX_RATE = 0.06; // 6% sales tax
		
		double quantity = 50, subtotal, tax, totalCost, unitPrice = 2;
		
		NumberFormat fm1 = NumberFormat.getCurrencyInstance();
		NumberFormat fm2 = NumberFormat.getPercentInstance();
		
		subtotal = quantity * unitPrice;
		tax = subtotal * TAX_RATE;
		totalCost = subtotal + tax;
		
		System.out.println("Subtotal "+fm1.format(subtotal));
		System.out.println("Taxrate "+fm2.format(TAX_RATE));
		System.out.println("Tax "+fm1.format(tax));
		System.out.println("Total "+fm1.format(totalCost));
	}
}
