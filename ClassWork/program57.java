
import java.util.Scanner;

class program57 {

    public static void main(String A[]) {

        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("Enter the frequency :");
        iValue = scanner.nextInt(); //4

        iteration.Display(iValue); //4
    }

}

class Iteration {

    public void Display(int iNo) { //4 is copied 
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {

            System.out.println("Jay Ganesh...");
        }
    }
}
