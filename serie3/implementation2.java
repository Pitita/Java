package serie3;

public class implementation2 {

	public static void main(String[] args) {
		double random = Math.random() * 1000;
		int n1 = 000, n2 = 000, n3 = 00, n4 = 00;
		
		String delimiter = "-";
		
		for(int i = 0; i<4; i++)
		{
			if(n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0)
			{
				n1 = (int) (Math.random() * 1000);
				n2 = (int) (Math.random() * 1000);
				n3 = (int) (Math.random() * 100);
				n4 = (int) (Math.random() * 100);
			}
			
			else if(n2>850)
			{
				n2 = (int) (Math.random() * 1000);
			}
			
		}
		
		System.out.print(n1 + delimiter + n2 + delimiter + n3 + delimiter + n4);

	}

}
