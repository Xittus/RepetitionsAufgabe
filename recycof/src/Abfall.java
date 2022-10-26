
public class Abfall {

	private boolean metall;
	private double kgPreis;
	private double kg;
	
	public Abfall(boolean metall, double kgPreis) {
		this.metall = metall;
		this.kgPreis = kgPreis;
	}
	
	public boolean isMetall() {
		return this.metall;
	}
	
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public double getWert() {
		return this.kg * this.kgPreis;
	}
}
