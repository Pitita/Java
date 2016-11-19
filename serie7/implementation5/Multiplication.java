package serie7.implementation5;

public class Multiplication {

	public static void main(String[] args) {
		final int MAX = 12;
		
		for(int i=1;i<=MAX;i++) {
			for(int j=1;j<=MAX;j++) {
				int result = i * j;
				System.out.print(result+"\t");
			}
			System.out.println();
		}

	}

}
