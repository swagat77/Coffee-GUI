import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.text.NumberFormat;
public class Primes{
    public Primes(int numThreads){
    }
    public Primes findPrimes(int lower,int upper){
    return this; 
    }
    protected void addPrimes(int lower,int upper){
   }
    
    public int numberOfPrimes(){
    return 0;
    }
    protected boolean isPrime(int number){
    int i=2;
    boolean is_Prime=true;
   while(i<Math.sqrt(number))
   {
   if(number%i==0)
   {
   is_Prime=false;
   break;
   }
   ++i;
   }
   return true;
   }
   public Integer[] toArray(){
   return new Integer[0];
   }
   public static void main(String[] args) {
        int numThreads = 1;
        int lower = 0;
        int upper = 10000; 
        if(args.length > 0) numThreads = Integer.parseInt(args[0]);
        if(args.length > 1) lower = Integer.parseInt(args[1]);
        if(args.length > 2) upper = Integer.parseInt(args[2]);
        if(args.length > 3) {
            System.err.println("usage: java Primes [lower upper]");
            System.exit(-args.length);
        }
        
        Primes primes = new Primes(numThreads); // Search using one thread
        primes.findPrimes(lower,upper);
        int sumOfPrimes = 0;
        for(int prime : primes.findPrimes(lower, upper).toArray())
            sumOfPrimes += prime;
        System.out.println("Sum of the " + primes.numberOfPrimes() + " primes between " 
                         + lower + " and " 
                         + upper + " is " 
                         + NumberFormat.getIntegerInstance().format(sumOfPrimes));
    }
    private int numThreads;
    private ArrayList<Integer> primes;
   }
    
         
