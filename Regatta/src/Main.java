public class Main {

    public static void main(String args[]){

    competition c = new competition("Regatta");

    ship ship1 = new ship(1, "Test");
    ship ship2 = new ship(2, "Test2");
    ship ship3 = new ship(3, "Test3");
    c.addship(ship1);
    c.addship(ship2);
    c.addship(ship3);

    c.start();
    c.printResault();
    }
}
