import java.util.Scanner;

public class positiveNeg {
    public static int positive(int Number1){
        if (Number1>0){
            return 1 ; }
        else if (Number1<0){
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" PLease enter number : ");
        int number = scanner.nextInt();
        int caseID = positive(number);

        switch (caseID){

            // Num is positive
            case 0:
                System.out.println("number is negative.");
                break;
            case 1:
                System.out.println(" number is positive ");
                break;
            default:
                System.out.println( "number is zero .");
        }


    }

}
