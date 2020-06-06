import java.util.Scanner;

public class Vote
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please check age to eligible for vote : ");//checking the age to eligible for vote
        int age = scanner.nextInt();
        if (age >= 18)
        {
            System.out.println(" eligible for vote "); //over age 18 is eligible to vote
        } else
            {
            System.out.println(" NOT eligible for vote ");//under age 18 is not eligible for vote
            }


    }
}

