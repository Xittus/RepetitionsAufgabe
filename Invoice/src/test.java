public class test {
    public static void main(String[] args) {
         invoice first = new invoice();
            first.setItems(new item("item1", 10));
            first.printInvoice();
    }
}
