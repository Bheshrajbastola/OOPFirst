import java.util.Scanner;
public class Oldest {
    public static void main(String[]args){
        System.out.println("Who is the oldest and youngest amongst These Freinds?.");

        int  a , b ,c;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Person One Age:");

        a = sc.nextInt();

        System.out.print("Enter Person Two Age:");

        b = sc.nextInt();

        System.out.print("Enter Person Three Age:");

        c = sc.nextInt();

        if ((a > b) &&(a > c))

        System.out.print("Person One is the Oldest Person");

        else if ((a <b) &&(a < c))

        System.out.print("Person One is the Youngest Person");

        else if (( b> a) && (b> c))

        System.out.print("Person two is the Oldest Person");

        else if ((b< a) && (b < c))

        System.out.print("Person Two is the Youngest Person");

        else if ((c < a) && (c < b))

        System.out.print("Person Three is the Youngest Person");

        else if ((c > a) && (c > b))

        System.out.print("Person Three is the Oldest Person");

        else
            System.out.println("The age is equal");



    }
}
