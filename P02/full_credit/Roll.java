 import java.util.Scanner;
 import java.util.Arrays;
 import java.text.DecimalFormat;
 import java.util.Random;
public class Roll
{
    static void Roll(int dice,
	                 int sides)
 {

    int sum=0;
    double avg=0;
    Scanner in=new Scanner(System.in);
    int[] roll= new int[dice];
	for(int i=0;i<roll.length;i++)
	{
	    roll[i]=(int)(1+Math.random()*sides);
	} 
	Arrays.sort(roll);
	for(int i=0;i<roll.length;i++)
	{
	    sum=sum+roll[i];
	    avg=(double)sum/dice ;
	    System.out.print(roll[i]+" " );
	}
	System.out.println("\n");
	System.out.println("Sum="+ sum);
	System.out.println("Average_="+new DecimalFormat("0.00000").format(avg));
 }

 public static void main(String[] args)
 {
   Scanner in=new Scanner(System.in);
   int dice,sides;
   if(args.length<2)
   {
      System.out.println("usage: java Roll [#dice] [#sides]");
   }
   else
   {
      dice = Integer.parseInt(args[0]);
      sides= Integer.parseInt(args[1]);
      Roll(dice,sides);
   }
 }
}
 
