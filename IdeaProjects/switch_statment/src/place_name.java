import java.util.Scanner;

public class place_name {
    public static void main(String[] args)
    {
        System.out.println(" Enter any Alphabet: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println( "Africa");
                break;
            case 'b':
                System.out.println( "Bombay");
                break;
            case 'c':
                System.out.println( "Chicago");
                break;
            case 'd':
                System.out.println( "Dhaka");
                break;
            case 'e':
                System.out.println( "Egypt");
                break;
            case 'f':
                System.out.println( "France");
                break;
            default:
                System.out.println("Invalid entry");

        }

    }

}
