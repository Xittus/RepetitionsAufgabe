/**
 * Stellt Funktionen eines Buches zur Verfügung
 * @author Roger Zaugg
 *
 */
public class Buch extends Medium {

	private String autor;
	private String verlag;
	private int anzahlSeiten;
	private String isbn;
	
	public Buch(String name, boolean ausgeliehen, String autor, String verlag, int anzSeiten, String isbn) {
		super(name, ausgeliehen);
		this.autor = autor;
		this.verlag = verlag;
		this.anzahlSeiten = anzSeiten;
		this.isbn = isbn;
	}

	/**
	 * @see bibliothek.Medium#printInformation()
	 */
	@Override
	public void printInformation() {
		super.printInformation();
		System.out.println("Autor: " + this.autor);
		System.out.println("Verlag: " + this.verlag);
		System.out.println("Anz. Seiten: " + this.anzahlSeiten);
		System.out.println("ISBN: " + this.isbn + "\n");
		
	}
	
	

}
