package serie9;

public class EnumDemo {

	public enum Season{
		winter ("December through February"),
		spring ("March through May"),
		summer ("June through August"),
		fall ("September through December");
		
	private String span;
	
	// Constructor: Sets up each value with an associated string.
	Season(String months){
		span = months;
	}
	
	// Returns the span message for this value.
	public String getSpan() {
		return span;
	}
	}

	
	public static void main(String[] args) {
		for(Season time : Season.values())
			System.out.println(time.getSpan());
	}

}
