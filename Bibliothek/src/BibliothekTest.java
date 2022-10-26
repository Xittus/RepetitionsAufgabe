

public class BibliothekTest {

	public static void main(String[] args) {
		Bibliothek bibliothek = new Bibliothek();
		Buch b1 = new Buch("Testbuch1", true, "Testautor", "Verlag", 100,
				"43543525432254");	
		Buch b2 = new Buch("Testbuch2", false, "Testautor2", "Verlag2", 200,
		"435456456456456");
		
		FilmDVD f1 = new FilmDVD("Film", true, "Regisseur", "Darsteller", "Studio", 90);
		FilmDVD f2 = new FilmDVD("Film2", false, "Regisseur2", "Darsteller", "Studio", 90);
		
		MusikCD c1 = new MusikCD("MusikCDName", true, "Interpretname", 20);
		MusikCD c2 = new MusikCD("MusikCDName2", false, "Interpretname2", 18);
	
		bibliothek.addMedium(b1);
		bibliothek.addMedium(b2);
		
		bibliothek.addMedium(f1);
		bibliothek.addMedium(f2);
		
		bibliothek.addMedium(c1);
		bibliothek.addMedium(c2);
		
		System.out.println("Alle Medien in der Bibliothek");
		bibliothek.showAllMedia();
		
		System.out.println();
		
		System.out.println("Ausgeliehene Medien in der Bibliothek");
		bibliothek.showBorrowedMedia();
		
		System.out.println();
		
		System.out.println("Aktuelle Gebühren der ausgeliehenen Medien");
		System.out.println(bibliothek.calcAusleigebuehr());
	}

		
	

}
