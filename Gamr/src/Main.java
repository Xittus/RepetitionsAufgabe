public class Main {


	public static void main(String... args) {
		Fight fight = new Fight();
		fight.setParticipan(new Character("Zenturo"));
		fight.setParticipan(new Character("Valarian"));

		fight.setParticipan(new Character("Tim"));
		fight.fight();

	}


}
