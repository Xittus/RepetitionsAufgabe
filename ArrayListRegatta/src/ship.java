import java.util.Random;

public class ship {
    private int nr;
    private String name;
    private int time;

    public ship(int nr, String name ) {
        this.nr = nr;
        this.name = name;
    }
    public int getNr() {
        return nr;
    }
    public String getName() {
        return name;
    }
public int getTime() {
        return time;
    }
    public void setNr(int nr) {
        this.nr = nr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public void race() {
        Random  random = new Random();
        int time = random.nextInt(300) + 300;
        this.setTime(time);
    }


}