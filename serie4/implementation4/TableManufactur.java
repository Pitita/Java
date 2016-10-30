package serie4.implementation4;

public class TableManufactur {

	public static void main(String[] args) {
		
		Table t1 = new Table(20, 15, 250, Material.metal);
		Table t2 = new Table(35, 65, 120, Material.metal);
		Table t3 = new Table(620, 15, 220, Material.metal);
		Table t4 = new Table(420, 225, 320, Material.wood);
		Table t5 = new Table(204, 45, 420, Material.wood);
		Table t6 = new Table(2230, 155, 520, Material.wood);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
	}

}
