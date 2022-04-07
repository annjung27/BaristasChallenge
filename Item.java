public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    public Item(String name, double price){
        this.name = name;
        this.price= price;
    }
    //   and sets them accordingly
    
    // GETTERS & SETTERS  - for name and price
    // Getter for name
    public String getName(){
        return this.name;
    }
    //Setter for name
    public void setName(String name){
        this.name = name;
    }
    //Getter for price
    public double getPrice(){
        return this.price;
    }
    //Setter for price
    public void setPrice(double price){
        this.price = price;
    }
    
}
