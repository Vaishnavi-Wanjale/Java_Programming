
class program55 {

    public static void main(String A[]) {

        Iteration iteration = new Iteration();
        iteration.Display();
    }

}
//for our batch counter will always starts with 1, but when traversing array start it with 0

class Iteration {

    public void Display() {
        int iCnt = 0;//counter

        for (iCnt = 1; iCnt <= 4; iCnt++) { //starting condition displacement
            System.out.println("Jay Ganesh...");
        }
    }
}
