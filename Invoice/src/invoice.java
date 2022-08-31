import java.util.ArrayList;

public class invoice {
    private ArrayList<item> items = new ArrayList<item>();

    public ArrayList<item> getItems() {
        return items;
    }
    public  void setItems(item item) {
        if(this.items == null) {
            this.items = new ArrayList<item>();
        }
        items.add(item);
    }

    public void setItems(ArrayList<item> items) {
        this.items = items;

    }
    public double getInvoiceAmountExc() {
        double amount = 0;
        for (item item : items) {
            amount += item.getPrice();
        }
        return amount;
    }
    public void printInvoice() {
        System.out.println("Invoice");
        System.out.println("====================");
        for (item item : items) {
            System.out.println(item.getText() + " " + item.getPrice());
        }
        System.out.println("====================");
        System.out.println("Total: " + getInvoiceAmountExc());
    }
}
