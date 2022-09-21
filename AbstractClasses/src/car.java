public abstract class car {
    private String model;
    protected double price;

    public car(String model, double price){
        this.model = model;
        this.price = price;
    }
    public abstract double getPrice();




}
