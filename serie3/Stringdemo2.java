package serie3;

public class Stringdemo2 {

	public static void main(String[] args) {
		String city = "London", city2 = "Rome";  // im Hintergrund wird eig. das hier ausgeführt: String city = new String("London");
		System.out.println(city.charAt(3)); // Liefert genau einen Buchstaben eines Strings zurück. In diesem Falle also wird der vierte Buchstabe "d" asugegeben. (charAt beginnt bei 0)
		System.out.println(city.compareTo(city2)); // -6
		System.out.println(city.equals(city2)); // false
		System.out.println(city.length()); // Länge des Strings. (6)
		city = city.replace('L', 'X'); // city entspricht nun Xondon
		System.out.println(city.substring(1, 6)); // ondon
		System.out.print(city.concat(city2.toUpperCase())); // XondonROME

	}

}
