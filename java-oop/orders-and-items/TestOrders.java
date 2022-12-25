public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4;


        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3;


        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 3.5;



        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";



        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;


        order1.ready = true;


        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true;


        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}