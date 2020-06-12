import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        System.out.println("please enter any Character : ");
        Scanner scanner = new Scanner(System .in);
        char ch = scanner.next().charAt(0);

        switch (ch)
        {
            case 'a':
                System.out.println( "vowel");
                break;
            case 'e':
                System.out.println( "vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case'o':
                System.out.println("vowel");
                break;
            case'u':
                System.out.println("vowel");
                break;
            case ('A'):
                System.out.println("vowel");
                break;
            case ('E'):
                System.out.println("vowel");
                break;
            case ('I'):
                System.out.println("vowel");
                break;
            case ('O'):
                System.out.println("vowel");
                break;
            case ('U'):
                System.out.println("vowel");
                break;
            default:
                System.out.println("Consonant");




        }

    }

}
