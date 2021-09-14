 /******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Student{
   private String studentName;
   private   double examSum;
    private double examnNumgrades;
  double counter;
  double average;
    //constructors
  public Student(String n){
      studentName=n;}
      public String getName(){
      return studentName;}
      public double addExam(){
          return examSum;}
          public double examNumGrades(){
          return counter;}
      
      public  double average(){
          average= examSum/counter;
          return average;}
    public String toString(){
       String result="";
        result=""+studentName+"  has a   "  +average+   "   average";
         return result;}
     }



