package store;
//help from the suggested solution sprint 3
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Store {   //help from suggested solution of sprint 3
    public Store(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
    }
    public Store(BufferedReader in) throws IOException {
        this(in.readLine());
        int size = Integer.parseInt(in.readLine());
        for(int i=0; i<size; ++i) {
            String productType = in.readLine();
            switch(productType) {
                case Java.ID:  products.add(new Java(in));  break;
                case Donut.ID: products.add(new Donut(in)); break;
                default: throw new IOException("Invalid product type: " + productType);
            }
        }
    }
    public void save(BufferedWriter out) throws IOException {
        out.write(storeName + '\n');
        out.write("" + products.size() + '\n');
        for(Product p : products)
            p.save(out);
    }

    String name() {return storeName;}
    public void addProduct(Product product) {
        products.add(product);
    }
    public int numberOfProducts() {
        return products.size();
    }
    public String toString(int index) {
        return products.get(index).toString();
    }
    @Override
    public String toString() {
        String result = "Welcome to " + storeName + "\n\n";
        for(int i=0; i<products.size(); ++i) {
            result += i + ") " + products.get(i) + "\n";
        }
        return result;
    }
     public void addPerson(Person person) { //helplp from suggested solution of sprint 3
        people.add(person);
    }
    public int numberOfPeople() {
        return people.size();
    }
    public String personToString(int index) {
        return people.get(index).toString();
     }
    public String peopleToString() {
        String result = "Welcome to " + storeName + "\n\n";
        for(int i=0; i<people.size(); ++i) {
            result += i + ") " + people.get(i) + "\n";
        }
        return result;
    }
   
    
   
    private String storeName;
    private ArrayList<Product> products;
    private ArrayList<Person>people;
}
