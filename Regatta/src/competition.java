public class competition {

    private String name;
    private ship[] ships = new ship[5];

    public competition(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addship(ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }

    }
    public void start() {
            for (ship s : this.ships) {
                if (s != null) {
                    s.race();
                }
            }
    };
    //print ship name + time of the ship
    public void printResault() {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] != null) {
                System.out.println(ships[i].getName() + " Your Time: " + ships[i].getTime());
            }
        }
    }
}