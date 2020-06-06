import java.util.Scanner;

public class InterChangeNumber {
    public static void main(String[] args)
    {
        int a, b, temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value of A and B :");
        System.out.print("A = ");
        a = scanner.nextInt();
        System.out.print("B = ");
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Number Interchanged Successfully..!!");

        System.out.println("A = " +a);
        System.out.println("B = " +b);

    }
}
