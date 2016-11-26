package serie8.aufg8;

public class Car implements Vehicel{
	private int wheels = 4;
	private String start = "BRUMMM!";

	public int getNumberOfWheels() {
		return this.wheels;
	}

	public void start() {
		System.out.println(this.start);
	}

}
