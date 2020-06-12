import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        System.out.println("Enter any number to check even or odd: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number % 2) {
            //* If n%2 == 0 *//
            case 0:
                System.out.println("Number is Even");
                break;

            //* Else if n%2 == 1 *//
            case 1:
                System.out.println("Number is Odd");
                break;

        }

    }

}
