public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Gabriela");
        Order order4 = new Order("Natalia");
        Order order5 = new Order("Olivia");

        Item item1 = new Item("cappuccino", 3.5);
        Item item2 = new Item("mocha", 4.5);
        Item item3 = new Item("latte", 4.0);
        Item item4 = new Item("drip coffee", 3.0);

        order1.addItem(item1);
        order1.addItem(item2);
        
        order2.addItem(item2);
        order2.addItem(item2);

        order3.addItem(item3);
        order3.addItem(item2);

        order4.addItem(item4);
        order4.addItem(item2);

        order5.addItem(item3);
        order5.addItem(item3);


        order1.setReady(true);
        // order2.setReady(true);
        // System.out.println(order1.getStatusMessage());
        // System.out.println(order2.getStatusMessage());
        // System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}