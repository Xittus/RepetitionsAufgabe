/**
 * Stellt Funktionen eines Filmes zur Verfügung
 * @author Roger Zaugg
 *
 */
public class FilmDVD extends Medium {

	private String regisseur;
	private String hauptdarsteller;
	private String studio;
	private int laufzeit;
	private double ausleihgebuehr = 2;

	public FilmDVD(String name, boolean ausgeliehen, String regisseur, String darsteller, String studio, int laufzeit) {
		super(name, ausgeliehen);
		this.regisseur = regisseur;
		this.hauptdarsteller = darsteller;
		this.studio = studio;
		this.laufzeit = laufzeit;
	}

	/**
	 * @see bibliothek.Medium#printInformation()
	 */
	@Override
	public void printInformation() {
		super.printInformation();
		System.out.println("Regisseur: " + this.regisseur);
		System.out.println("Hauptdarsteller: " + this.hauptdarsteller);	
		System.out.println("Studio: " + this.studio);
		System.out.println("Laufzeit: " + this.laufzeit + "\n");
	}

	@Override
	public double getGebuehr() {
		return this.ausleihgebuehr;
	}

	

}
