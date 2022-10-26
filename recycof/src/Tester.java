
public class Tester {

	public static void main(String[] args) {
		Recyhof recy = new Recyhof();
		Abfall m1 = new Abfall(true, 20);
		m1.setKg(100);
		
		Abfall m2 = new Abfall(true, 10);
		m2.setKg(10);
		
		Abfall u1 = new Abfall(false, 1);
		u1.setKg(10);
		
		recy.addAbfall(m1);
		recy.addAbfall(m2);
		recy.addAbfall(u1);
		
		System.out.println("Metallwert: " + recy.getMetallwert());
		System.out.println("Gesamtwert: " + recy.getGesamtWert());
	}
}
