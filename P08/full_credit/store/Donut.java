package store;
import io.java.BufferedReader;
import io.java.BufferedWriter;
public class Donut extends Product {
    public Donut(String name, double price, double cost, Frosting frosting, Filling filling, boolean sprinkles) {
        super(name, price, cost);
        this.frosting = frosting;
        this.filling = filling;
        this.sprinkles = sprinkles;
        if(sprinkles && frosting == Frosting.Unfrosted)
            throw new IllegalArgumentException("Unfrosted Donut cannot have sprinkles");
             BufferReader in =new BufferedReader(new FileReader((args[0]))); //from the lecture 15
        String line;
        while((line=br.readLine())!=null)
        System.out.printline(line);
        }
        }
     public save(BufferedWriter out){
     BufferedWriter out = new BufferedWriter(new FIleWriter((args[0])));
     String line;
     out.write("new Donut");
     out.save();
     out.close();
     }
    }

    @Override
    public String toString() {
         return name + " (" 
              + ((frosting != Frosting.Unfrosted) ? "frosted with " : "") + frosting
              + ((filling != Filling.Unfilled) ? " filled with " : " ") + filling
              + ((sprinkles) ? " add sprinkles" : "")
              + ") $" + price;
    }

    Frosting frosting;
    Filling filling;
    boolean sprinkles;
}
