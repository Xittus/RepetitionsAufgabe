public class car {
    private String model;
    private double price;

    public car(String model, double price){
        this.model = model;
        this.price = price;
    }
    protected double getPrice() {
        return price;

    }

}
