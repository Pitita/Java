package serie6.implementation1;

public class Bulb {
	
	boolean status = false;
	String s;
	
	public Bulb(boolean status)
	{
		this.status = status;
	}
	
	public Bulb()
	{
		this.status = false;
	}
	
	public void switchOn()
	{
		this.status = true;
	}
	
	public void switchOff()
	{
		this.status = false;
	}
	
	public void switchBulb()
	{
		this.status = !status;
	}
	
	public String toString()
	{
		if(status)
		{
			s = "*";
		}
		else
		{
			s = "o";
		}
		return s;
	}

	public static void main(String[] args) {
		Bulb b1 = new Bulb();
		Bulb b2 = new Bulb();
		Bulb b3 = new Bulb(true);
		Bulb b4 = new Bulb(true);
		
		b1.switchOn();
		b2.switchBulb();
		b4.switchOff();
		
		System.out.println(b1.toString() + b2 + b3 + b4);

	}

}
