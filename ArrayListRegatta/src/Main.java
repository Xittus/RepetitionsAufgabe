public class Main {

    public static void main(String[] args){

    competition c = new competition("Regatta");

    ship ship1 = new ship(1, "Test");
    ship ship2 = new ship(2, "Test2");
    ship ship3 = new ship(3, "Test3");
    ship ship4 = new ship(3, "Test4");
    ship ship5 = new ship(3, "Test5");
    ship ship6 = new ship(3, "Test6");
    ship ship7 = new ship(3, "Test7");
    ship ship8 = new ship(3, "Test8");
    ship ship9 = new ship(3, "Test9");
    ship ship10 = new ship(3, "Test10");
    ship ship11 = new ship(3, "Test11");
    c.addship(ship1);
    c.addship(ship2);
    c.addship(ship3);
    c.addship(ship4);
    c.addship(ship5);
    c.addship(ship6);
    c.addship(ship7);
    c.addship(ship8);
    c.addship(ship9);
    c.addship(ship10);
    c.addship(ship11);

    c.start();
    c.printResault();
    }
}
