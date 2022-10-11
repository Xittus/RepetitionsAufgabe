import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fight {

	private List<Character> participan = new ArrayList<Character>();

	private List<Wapon> weapons = new ArrayList<Wapon>();

	public Fight() {
		this.weapons.add(new Sword());
		this.weapons.add(new Pistol());
	}

	public boolean ready() {
		return this.participan.size() >= 2;
	}

	public void oneFight(Character fighterA, Character fighterB) {
		Random random = new Random();
		Wapon weapon  = this.weapons.get(random.nextInt(this.weapons.size()));
		int damage = weapon.use(fighterA.getAp());

		fighterB.setHp(damage);

		System.out.println("*********");
		System.out.println(String.format("%s hit %s and made %s damage", fighterA.getName(),
				fighterB.getName(), damage));
		System.out.println(fighterA.getName()  + " : " + fighterA.getHp());
		System.out.println(fighterB.getName()  + " : " + fighterB.getHp());
		System.out.println("*********");

		if(fighterB.death()) {
			System.out.println(fighterB.getName()  +  " is death");
			this.participan.remove(this.participan.indexOf(fighterB));
		}

	}

	public void fight() {

		Random random = new Random();

		if (this.participan.size() < 2) {
			System.err.println("You need at minimum 2 Participants to star a game");
		}

		while (ready()) {
			int posFighterA = random.nextInt(this.participan.size());
			int posFighterB;
			do {
				posFighterB = random.nextInt(this.participan.size());
			} while (posFighterA == posFighterB);

			Character fighterA = this.participan.get(posFighterA);
			Character fighterB = this.participan.get(posFighterB);

			int damage;
			while (!fighterA.death() && !fighterB.death()) {

				oneFight(fighterA, fighterB);
				oneFight(fighterB, fighterA);
			}
		}



		System.out.println("The Winner is " + this.participan.get(0).getName());

	}

	// Getter and Setter

	public List<Character> getParticipan() {
		return participan;
	}

	public void setParticipan(List<Character> participan) {
		this.participan = participan;
	}

	public void setParticipan(Character character) {
		this.participan.add(character);
	}

	public List<Wapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Wapon> weapons) {
		this.weapons = weapons;
	}


}