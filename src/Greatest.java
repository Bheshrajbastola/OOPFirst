import java.util.Scanner;
public class Greatest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int first , second;

        System.out.print("enter the first number : ");
        first=sc.nextInt();

        System.out.print("enter the second number : ");
        second=sc.nextInt();

        if (first>second)
            System.out.print(first);
        else
            System.out.println(second);

    }
}


