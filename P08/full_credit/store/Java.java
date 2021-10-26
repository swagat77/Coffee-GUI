package store;

import java.util.ArrayList;
import java.io.BufferReader;
import java.io.BufferedWriter;

public class Java extends Product {
    public Java(String name, double price, double cost, Darkness darkness) {
        super(name, price, cost);
        this.darkness = darkness;
        this.shots = new ArrayList<>();
         BufferReader in =new BufferedReader(new FileReader((args[0]))); //from the lecture 15
        String line;
        while((line=br.readLine())!=null)
        System.out.printline(line);
        }
        }
     public save(BufferedWriter out){
     BufferedWriter out = new BufferedWriter(new FIleWriter((args[0])));
     String line;
     out.write("new Java");
     out.save();
     out.close();
     }
    }
    public void addShot(Shot shot) {
        shots.add(shot);
    }
    @Override
    public String toString() {
        String result = name + " (" + darkness + " with ";
        if (shots.size() == 0) result += "no shots";
        else {
            String separator = "";
            for(Shot s : shots) {
                result += separator + s; 
                separator = ", ";
            }
        }
        result += ") $" + price;
        return result;
    }

    Darkness darkness;
    ArrayList<Shot> shots;
}
