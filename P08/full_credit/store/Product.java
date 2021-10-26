package store;
import java.io.BUfferedWriter;
import java.io.BUfferedReader;

public class Product {
    public Product(String name, double price, double cost) {
        this.name  = name;
        this.price = price;
        this.cost  = cost;
         BufferReader in =new BufferedReader(new FileReader((args[0]))); //from the lecture 15
        String line;
        while((line=br.readLine())!=null)
        System.out.printline(line);
        }
        }
     public save(BufferedWriter out){
     BufferedWriter out = new BufferedWriter(new FIleWriter((args[0])));
     String line;
     out.write("new Product");
     out.save();
     out.close();
     }
    }
    public String name() {return name;}
    @Override
    public String toString() {
        return name + " ($" + price + ", ";
    }

    protected String name;
    protected double cost;
    protected double price;
}
