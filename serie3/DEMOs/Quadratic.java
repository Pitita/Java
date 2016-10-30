package serie3.DEMOs;

public class Quadratic {

	public static void main(String[] args) {
		double discriminant, root1, root2,
		a=2, 
		b=10,
		c=8;
		
		discriminant = Math.pow(b, 2) - (4 * a * c);
		root1 = ((-1*b) + Math.sqrt(discriminant)) / (2*a);
		root2 = ((-1*b) - Math.sqrt(discriminant)) / (2*a);
		
		System.out.println(root1 + "|" + root2);
	}

}
