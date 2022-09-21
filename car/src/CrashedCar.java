public class CrashedCar extends car{
    private int damagelevel;
    public CrashedCar(String model, double price, int damagelevel) {
        super(model, price);
        this.damagelevel = damagelevel;
    }

    public double getPrice() {
        return super.getPrice();
    }
     public int getDamagelevel() {
         return damagelevel;
    }
    public void  setDamagelevel(int damagelevel) {
        this.damagelevel = damagelevel;
    }
}
