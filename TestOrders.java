import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args){

        // Menu Items
        Item item1 = new Item("capuccino", 3.5);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("drip coffee", 1.5);
        Item item4 = new Item("green tea", 4.5);
        

        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();        
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Cinduri");        
        Order order4 = new Order("Annie");
        Order order5 = new Order("Deborah");
        
        //Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItems(item1);
        order1.addItems(item2);
        order2.addItems(item3);
        order2.addItems(item4);
        order3.addItems(item2);
        order3.addItems(item3);
        order4.addItems(item2);
        order4.addItems(item4);

        //Implement the getStatusMessage method within the Order class
        order4.getStatusMessage();
        //Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        System.out.println(order4.getName());
        order4.setReady(true);
        System.out.println(order4.getStatusMessage());

        //Implement the getOrderTotal method within the Order class
        order4.getOrderTotal();
        System.out.println("Your Total is: $ " + order4.getOrderTotal());

        //Implement the display method within the Order class
        order4.displayOrder();    
        
        
    }
}