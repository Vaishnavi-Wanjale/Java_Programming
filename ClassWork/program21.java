import java.util.*;

class program21
{
  public static void main(String A[])
  {
    //buffered input mule exception yeta tya mule we avoid using buffered reader.
    //we have to also write try catch block, exception etc.
    //tya mule we use non buffered input using scanner class.

    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter your name : ");
    String name = sobj.nextLine();

    System.out.println("Welcome " + name);

    

  }
}