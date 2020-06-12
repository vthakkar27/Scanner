import java.util.Scanner;

public class calculation {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter first number");
        int a = scanner.nextInt();
        System.out.println("please enter second number");
        int b = scanner.nextInt();
        System.out.println("please enter symbol (+, -, *, /)");
        String sym = scanner.next();
        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = a/b;
        int res;


        switch(sym)
        {
            case "+":res= add;
                System.out.println("Sum of the given two numbers: "+(a+b));
                break;
            case "-":res= sub;
                System.out.println("Difference between the two numbers: "+(a-b));
                break;
            case "*":res= multi;
                System.out.println("Product of the two numbers: "+(a*b));
                break;
            case "/":res= div;
                System.out.println("Result of the division: "+(a/b));
                break;
            default :
                System.out.println("Invalid grade");

        }
    }

}
