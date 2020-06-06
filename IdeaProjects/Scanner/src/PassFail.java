import java.util.Scanner;

public class PassFail {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Student need to  Pass all subject");
        int Marks = scanner.nextInt();
        //student need to get mark more then 35
        if (Marks >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");

        }


    }

}
