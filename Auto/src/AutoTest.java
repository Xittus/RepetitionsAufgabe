import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AutoTest {

	private Auto auto = null;
	
	@BeforeEach
	public void setUp() {
		this.auto = new Auto();
	}

	@Test
	public void testGetTankinhalt() {
		assertEquals(0, auto.getTankinhalt(), 0.001);
	}

	@Test
	public void testTanken() {
		
		auto.tanken(50);
		assertEquals(50, auto.getTankinhalt(), 0.001);
		auto.tanken(0.01);
		assertEquals(50, auto.getTankinhalt(), 0.001);
	}
		
	@Test
	public void testFahren() {
		//Spezialfall, wenn noch nicht getankt wurde
		auto.fahren(0.01);
		assertEquals(0, auto.getTankinhalt(), 0.001);
		
		//voll tanken = Reichweite von 1000km
		auto.tanken(50);
		
		//fahren bis Tank leer
		auto.fahren(1000);
		assertEquals(0, auto.getTankinhalt(), 0.001);
		
		//erneut versuchen zu fahren -> darf nicht mehr gehen
		auto.fahren(0.01); 
		assertEquals(0, auto.getTankinhalt(), 0.001); // Tank bleibt leer
	}
	
	//Zusatzüberlegungen
	@Test
	public void testTankenNeg() {
		auto.tanken(-0.01);
		assertEquals(0, auto.getTankinhalt(), 0.001); 
		// Test schlägt Fehl, da im Code nicht geprüft wird, ob Wert negativ ist
		// es wäre eine Korrektur im Code notwendig
	}
	
	@Test
	public void testFahrenNeg() {
		auto.fahren(-0.01); 
		// Test schlägt Fehl, da im Code nicht geprüft wird, ob Wert negativ
		// es wäre eine Korrektur im Code notwendig
		assertEquals(0, auto.getTankinhalt(), 0.001);
	}
}
