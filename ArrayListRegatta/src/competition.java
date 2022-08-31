import java.util.ArrayList;

public class competition {

    private String name;

    private  ArrayList<ship> ships = new ArrayList<ship>();

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
        ships.add(ship);
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
        for (ship ship : ships) {
            System.out.println(ship.getName() + " Your Time: " + ship.getTime());
        }
        }
    }

