import java.util.ArrayList;

public class Recyhof {

	private ArrayList<Abfall> abfaelle = new ArrayList<Abfall>();
		
	public void addAbfall(Abfall a) {
		this.abfaelle.add(a);
	}
	
	public double getMetallwert() {
		double wert = 0;
		for(Abfall a : this.abfaelle) {
			if(a.isMetall()) {
				wert += a.getWert();
			}
		}
		return wert;
	}
	
	public double getGesamtWert() {
		double gesamtwert = 0;
		for(Abfall a : this.abfaelle) {
			gesamtwert += a.getWert();
		}
		return gesamtwert;
	}
}
