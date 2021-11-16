package store; //help from sprint 4
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class Customer extends Person{
 public Customer(String name, String phone){
 this.name=name;
 this.phone=phone;
 }
 public Product(BufferedReader in) throws IOException {
        this.name  = in.readLine();
        this.phone = in.readLine();
        
    }
       @Override
    public void save(BufferedWriter out) throws IOException {
        out.write("" + name  + '\n');
        out.write("" + phone  + '\n');
      
    }
 }
