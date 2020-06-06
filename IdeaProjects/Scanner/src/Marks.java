import java.util.Scanner;

public class Marks {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Name" + "&" + " Roll number ");
        System.out.println("Please enter your Maths mark:");
        int Maths = scanner.nextInt();
        System.out.println("Please enter your Science mark:");
        int Science = scanner.nextInt();
        System.out.println("Please enter your English mark:");
        int english = scanner.nextInt();
        int total = Maths + english + Science;
        double percentage = total / 3;
        System.out.println("Total marks = total");
        System.out.println("percentage = " + percentage);
        if (percentage >= 80)
        {
            System.out.println("A+");

        } else if (percentage < 80 && percentage >= 60)
        {
            System.out.println("A grade");

        } else if (percentage < 60 && percentage >= 50)
        {
            System.out.println("B grade");
        } else if (percentage < 50 && percentage >= 35)
        {
            System.out.println( "fail");
        }
    }
    }


