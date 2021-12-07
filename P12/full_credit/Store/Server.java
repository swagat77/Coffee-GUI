package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class  Server extends Person{
public Server( String name, String phone, String ssn){
super(name,phone,ssn);
}
public Customer(BufferedReader in) throws IOException {
        super(in);
    }
    @Override
    public void save(BufferedWriter out) throws IOException {
        out.write(ssn + '\n');
        super.save(out);
    }
    private String ssn;
}
