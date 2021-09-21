 import java.util.Scanner;
public class Boom {
	public static void main(String[] args) {
	    String solution;
	    boolean play=true;
	    boolean win=false;
	    char c;
	    String proposedSolution;
	    char propSoln='!';
	    char exit='0';
	    Scanner in =new Scanner(System.in);
	    Puzzle in=new Puzzle();
	    Fuse in=new Fuse();
		System.out.println("=====================");
	    System.out.println("    B O O M !              ");
        System.out.println("=====================");
        System.out.println("Enter a lowercase letter to guess,");
        System.out.println("! to propose a solution,");
        System.out.println("0 to exit.");
        System.out.println("Guess a letter:");
        char c=in.charAt(0);
        if (c='A'||'B'||'C'||'D'||'E'||'F'||'G'||'H'||'I'||'J'||'K'||'L'||'M'||'N'||'O'||'P'||'Q'||'R'||'S'||'T'||'U'||'V'||'W'||'X'||'Y'||'Z'){
        char c=c.toLowerCase();
        }else{
            while(play=true){
               System.out.println("Guess a letter");
               char c=in.charAt(0);
            }
        
        }	    
}	}

