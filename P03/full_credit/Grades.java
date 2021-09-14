 import java.util.*;
public class Grades
{
	public static void main(String[] args) {
	    String studentName;
	  double examNumGrades;
        double examSum=0;
	   double counter=0;;
	    double average;
	    Scanner k=new Scanner(System.in);
		System.out.println("enter your name:");
		studentName=k.nextLine();
	while(true){
	    System.out.println("enter your grade <0 when done");
	    examNumGrades=k.nextDouble();
	    examSum+=examNumGrades;
	    if(examNumGrades<0){
	    break;}
	    counter++;}
	  Student std1= new  Student(studentName);
	//  System.out.println(std1.toString());
	System.out.println(std1.toString());
	   

	}
		   
		    }
		
	    
	    
	    
	

