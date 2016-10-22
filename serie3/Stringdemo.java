package serie3;

public class Stringdemo {

	public static void main(String[] args) {
	
		String s1 = "HELLO", s2 = "World", s3 = "Tschüss", s4 = "World";
		
		char c1 = s1.charAt(0);
		System.out.println(c1);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		
		s1 = s1.replace('H', 'X');
		System.out.println(s1);
		
		System.out.println(s1.substring(2, 4));
		
		String final_statement = s1.concat(s2).concat(s3).concat(s4);
		System.out.print(final_statement.toUpperCase());
		
		
		String str = "Space, the final frontier";
		System.out.println (str.length());  // 25
		System.out.println (str.substring(2,5)); //ace
		System.out.println (str.toUpperCase()); // SPACE, THE FINAL FRONTIER
		System.out.println (str.length()); // 25
		

	}

}
