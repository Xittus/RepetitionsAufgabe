public class Character {
	
	private String name;
	
	private int ap = 15;
	
	private int hp = 100;
	
	public Character(String name) {
		this.name = name;
	}
	
	public boolean death() {
		return this.hp <= 0;
	}
	
	//Getter and Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap += ap;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp -= hp;
		if(this.hp < 0 ) {
			this.hp = 0;
		}
	}
	
	
	
	
}	
