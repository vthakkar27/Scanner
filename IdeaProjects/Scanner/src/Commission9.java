import java.util.Scanner;



public class Commission9
{
    public static void main(String[] args)
    {  // to check sales commission;
        Scanner scanner = new Scanner(System.in);//use scanner
        System.out.println("Enter employee_Id");
        int id = scanner.nextInt();
        System.out.println("Enter employee Name:");
        String name = scanner.next();
        System.out.println("Enter basic_salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter Sales_amount");
        double amount = scanner.nextDouble();


        if (amount<10000)
        {
            System.out.println("sales commission is " + (amount*2/100));//commission is 2% of the sales
        }
        else if (amount>=10000 && amount < 20000)
        {
            System.out.println("sales commission is" + (amount*5/100));//commission is 5% of the sales
        }
        else if (amount>=20000 && amount < 30000)
        {
            System.out.println("sales commission is " + (amount*10/100));//commission is 10% of the sales
        }else if (amount>=30000 && amount <50000){
            System.out.println("sales commission is " + (amount*20/100));//commission is 20% of the sales
        }
        else if(amount >= 50000)
        {
            System.out.println("sales commission is" + (amount*35/100));//commission is 35% of the sales

        }
    }
}
