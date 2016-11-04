package serie5.challenge;

public class College {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Riesen", 243, Fachgebiet.WI);
		
		System.out.println(t1);
		
		t1.setFachgebiet(Fachgebiet.BOEK);
		t1.setName("Kaspar");
		t1.setRaumnNr(211);
		
		System.out.println(t1);

	}

}
