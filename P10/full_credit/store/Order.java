 package store;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class Order{
 public Order(Customer customer, Server server){
 this.Customer=Customer;
 this.server= server;
 }
 public void getID(int id){
 return id;
 }
   public Order(BufferedReader in) throws IOException {
        this.Customer  = in.readLine();
        this.server  = in.readLine();
        this.id = int.parseInt(in.readLine());
    }
    public void save(BufferedWriter out) throws IOException {
        out.write("" + Customer  + '\n');
        out.write("" + server  + '\n');
        out.write("" + id + '\n');
    }
    
public void addProduct(int quantity,Product product){
products.add(product);
quantity.add(quantity);
}
public class hashmap{
 HashMap<Product,Integer>products= new HashMap<>();
}
 @Override
    public String toString() {
        return Customer + " (" + server + ", " + id")";
    }
    private int id;
    private Customer customer;
    private  Server server;
    }
