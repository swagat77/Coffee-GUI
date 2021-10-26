package store;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BUfferedWriter;
public class Store {
    public Store(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>()
        BufferReader in =new BufferedReader(new FileReader((args[0]))); //from the lecture 15
        String line;
        while((line=br.readLine())!=null)
        System.out.printline(line);
        }
        }
     public save(BufferedWriter out){
     BufferedWriter out = new BufferedWriter(new FIleWriter((args[0])));
     String line;
     out.write("new Store");
     out.save();
     out.close();
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
    private String storeName;
    private ArrayList<Product> products;
}
