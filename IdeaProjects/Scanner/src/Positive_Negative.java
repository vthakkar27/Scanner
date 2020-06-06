import java.util.Scanner;

public class Positive_Negative
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to check");
        int n = scanner.nextInt();
        if (n > 0)
        {
            System.out.println("The given Number " + n + " is positive");
        } else if (n < 0)
        {
            System.out.println("The given Number"+ n +" is Negative ");
        }
    }
}