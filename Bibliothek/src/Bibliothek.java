import java.util.ArrayList;
import java.util.List;

/**
 * Stellt Funktionen einer Bibliothek zur Verfügung
 * @author Roger Zaugg
 *
 */
public class Bibliothek {

	 private List<Medium> medien = new ArrayList<Medium>();
	
	/**
	 * Fügt der Bibliothek ein Medium hinzu
	 * @param m Medium
	 */
	public void addMedium(Medium m) {
		this.medien.add(m);
	}
	
	/**
	 * Gibt alle Medien der Bibliothek auf die Konsole aus
	 */
	public void showAllMedia() {
		for(Medium m : this.medien) {
			if(m != null) {
				m.printInformation();
			}
		}
	}
	
	/**
	 * Gibt alle ausgeliehenen Medien auf die Konsole aus
	 */
	public void showBorrowedMedia() {
		for(Medium m : this.medien) {
			if(m != null && m.getEntleihstatus()) {
				m.printInformation();
			}
		}
	}
	
	/**
	 * Berechnet die Gebühr aller ausgeliehenen Medien
	 * @return Summe aller Gebühren
	 */
	public double calcAusleigebuehr() {
		double retval = 0;
		for(Medium m : this.medien) {
			if(m != null && m.getEntleihstatus()) {
				retval += m.getGebuehr();
			}
		}
		return retval;
	}
}
