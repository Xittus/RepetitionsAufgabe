/**
 * Stellt Funktionen eines Mediums zur Verfügung
 * @author Roger Zaugg
 *
 */
public class Medium {

	private String name;
	private boolean entleihstatus;
	
	public Medium(String name, boolean ausgeliehen) {
		super();
		this.name = name;
		this.entleihstatus = ausgeliehen;
	}
	
	public void printInformation() {
		System.out.println("Mediuminformation:");
		System.out.println("Name: " + name);
		System.out.println("Ausgeliehen: " + entleihstatus);
	}

	/**
	 * 
	 * @return
	 */
	public double getGebuehr() {
		return 0;
	}
	

	/**
	 * @return the entleihstatus
	 */
	public boolean getEntleihstatus() {
		return entleihstatus;
	}

	/**
	 * @param entleihstatus the entleihstatus to set
	 */
	public void setEntleihstatus(boolean entleihstatus) {
		this.entleihstatus = entleihstatus;
	}
}
