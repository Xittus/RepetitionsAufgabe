public class item {
    private  String text;
    private double price;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public item(String text, double price) {
        setText(text);
        setPrice(price);
    }
}
