import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    // class methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " = $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}