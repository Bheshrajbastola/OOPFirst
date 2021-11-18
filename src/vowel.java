import java.util.Scanner;

public class vowel {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a character : ");

        char chr=sc.next().charAt(0);

        if (chr=='a')
        System.out.println(chr+"is a vowel");
        else if (chr=='e')
        System.out.println(chr+" is a vowel");

        else if (chr=='i')
            System.out.println(chr+"is a vowel");

        else if (chr=='o')
            System.out.println(chr+"is a vowel");

        else if (chr=='u')
            System.out.println(chr+"is a vowlel");

        else
            System.out.println(chr+"is consonant");



    }
}
