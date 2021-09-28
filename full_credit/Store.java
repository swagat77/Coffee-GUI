import java.util.ArrayList;
import java.util.Scanner;
public class Store{
    public static void main(String[] args){
      String[] Products= {"Milk(2.00)",
                         "bread","icecream","water","medicine","noodle"} ;
     Scanner in = new Scanner(System.in);
public static void cli(Products){


Taxed p=new Taxed();
p.placeOrder();
Taxfree n=new Taxfree();
n.placeOrder();
 System.out.println("=============================");
 System.out.println("    Welcome to the Store");
 System.out.println("=============================")  ;   
cli(Products);
System.out.println("current order:");
System.out.println("Total due today: $0.0");   
System.out.println("Enter quantity (0 to complete order) and product:");

    }
    }
    public void cli(String[] input){
        double salesTaxRate=0.075;
        for (int i=0,i<input.length,i++)
        {
            System.out.println(input[i]);
        }
    }
}
