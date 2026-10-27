import java.util.Scanner;

class program23
{
  public static void main(String A[])
  {
    Scanner scanner = null; //here scanner refers to the object
    String sName = null;
    
    scanner = new Scanner(System.in); 
    
    System.out.println("Enter your name : ");
    sName = scanner.nextLine();

    System.out.println("Welcome " + sName);

    

  }
}