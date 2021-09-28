import java.util.Scanner;
import java.util.Arraylist;

package cart{
     
    abstract class Product{
    protected   String name;
    protected Double unitCost;
    protected int quantity;


/** 
 *
 * Product
 *
 * @param name  the name
 * @param unitCost  the unit cost
 * @return public
 */
    public Product(String name,Double unitCost ){ 

    name=this.name;
    unitCost=this.unitCost;

    }

/** 
 *
 * Place order
 *
 * @param quantity  the quantity
 */
     public abstract void placeOrder(int quantity){ 

         
     }

/** 
 *
 * Price
 *
 */
     public abstract void price(){  

         Double price;
     }

/** 
 *
 * To string
 *
 * @return String
 */
     public String toString(){ 

         return string;
         
     }
     public class Taxfree{

/** 
 *
 * It is a constructor. 
 *
 * @param name  the name
 * @param cost  the cost
 */
        public Taxfree(String name,Double cost){ 

            name=name;
            cost=unitCost;
            
        }

/** 
 *
 * Place order
 *
 * @param quantity  the quantity
 */
        public void placeOrder(int quantity){ 

            
        }

/** 
 *
 * Price
 *
 * @param price  the price
 */
        public void price(Double price){ 

            
        }
    }

    public classs Taxed{
        private Double tax;

/** 
 *
 * Taxed
 *
 * @param name  the name
 * @param cost  the cost
 * @return public
 */
        public Taxed (String name,Double cost){ 

            name=name;
            cost=unitCost;
            
        }

/** 
 *
 * Sets the sales tax rate
 *
 * @param salesTaxRate  the sales tax rate
 */
        public  static  void setSalesTaxRate(Double salesTaxRate){ 

            salesTaxRate=0.0075
        }

/** 
 *
 * Place order
 *
 * @param quantity  the quantity
 */
        public void placeOrder( int quantity){ 

            return quantity;
        }

/** 
 *
 * Price
 *
 * @param price  the price
 */
        public void price(Double price){ 

            return price;
        }
        
    }

    public class Store{

/** 
 *
 * Main
 *
 * @param args  the args
 */
        public static void main(String[] args){ 

          String[] Products= {"Milk(2.00)",
                             "bread(1.99)","icecream(1.00)","water(1.50)","medicine(2.10)","noodle(1.99)"} ;


/** 
 *
 * Cli
 *
 * @param   the 
 * @throws ;
    Scanner in = new Scanner(System.in
 */
    public static void cli(Products); 
    Scanner in = new Scanner(System.in);
    System.out.println("=============================");
    System.out.println("    Welcome to the Store");
    System.out.println("=============================")  ;   
    cli(Products);
    System.out.println("current order:");
    System.out.println("Total due today: $0.0");   
    System.out.println("Enter quantity (0 to complete order) and product:");

        }
        public void cli(String[] input){

            double taxRate=0.08;
            for (int i=0;i<input.length;i++)
            {
                System.out.println(input[i]);
            }
        }
 Taxed p=new Taxed();
 p.placeOrder();
 Taxfree n=new Taxfree();
  n.placeOrder();   }}



 
