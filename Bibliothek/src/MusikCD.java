/**
 * Stellt Funktionen einer Musik CD zur Verfügung
 * @author Roger Zaugg
 *
 */
public class MusikCD extends Medium {

	private String interpret;
	private int anzLieder;
	private double ausleihgebuehr = 1;
	
	public MusikCD(String name, boolean ausgeliehen, String interpret, int anzLieder) {
		super(name, ausgeliehen);
		this.interpret = interpret;
		this.anzLieder = anzLieder;
	}

	/**
	 * @see bibliothek.Medium#printInformation()
	 */
	@Override
	public void printInformation() {
		super.printInformation();
		System.out.println("Interpret: " + this.interpret);
		System.out.println("Anz. Lieder: " + this.anzLieder + "\n");	
	}

	@Override
	public double getGebuehr() {
		return this.ausleihgebuehr;
	}
}
