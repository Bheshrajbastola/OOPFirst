import java.util.Scanner;
public class UserInput {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        //data representation
        int first;
        int second;
        int result;

        // user input
        System.out.print("enter the first number : ");
        first =sc.nextInt();

        System.out.print("enter the second number : ");
        second =sc.nextInt();

        result=first +second;
        System.out.println("the sum of "+first+"and" +second+ "number is " +result);

    }
}


