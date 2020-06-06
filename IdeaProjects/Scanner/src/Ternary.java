import java.util.Scanner;

public class Ternary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please Enter the number : ");
        int number = scanner.nextInt();
      String result = (number % 2 ==0 ) ? "even number": "odd number";
    {
    System.out.println(result);
        }

    }
}