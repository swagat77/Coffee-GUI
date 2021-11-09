package store;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
class Person{
 protected String name;
 protected String name;
 public Person(String name, String phone){
 this.name=name;
 this.phone=phone;
 }
    public Product(BufferedReader in) throws IOException {
        this.name  = in.readLine();
        this.phone = in.readLine();
        
    }
    public void save(BufferedWriter out) throws IOException {
        out.write("" + name  + '\n');
        out.write("" + phone  + '\n');
      
    }
    @Override
    public String toString() {
        return name + " (" + phone + ", ";
    }
    }
 
