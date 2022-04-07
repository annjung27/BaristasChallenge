import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";  
        this.ready = false;
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    
    // ORDER METHODS
    //add item
    public void addItems(Item item){
        this.items.add(item);
    }
    
    //get status message
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready!";
        } else {
            return "thank you for waiting. Your order will be ready soon";
        }
    }

    //Display
    public String displayOrder(){
        System.out.println("Customer Name: " + this.name);
        for(Item item : this.items){
            System.out.println(item.getName()+ " - $ " + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());

    }

    // get order total
    public double getOrderTotal(){
        double total = 0;
        for (Item item : this.items ){
            total = total + item.getPrice();
        } 
        return total;
    }
    
    // GETTERS & SETTERS
    // Getter for name
    public String getName(){
        return this.name;
    }
    // Setter for name
    public void setName(String name){
        this.name = name;
    }
    // Getter for ready
    public boolean getReady(){
        return this.ready;
    }
    // Setter for ready
    public void setReady(boolean ready){
        this.ready = ready;    
    }
    // Getter for itmes
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // Setter for items
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}

