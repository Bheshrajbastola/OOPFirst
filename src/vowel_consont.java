import java.util.Scanner;
public class vowel_consont {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter a character : ");
        char chr=sc.next().toLowerCase().charAt(0);



        if (chr=='a'|| chr=='e'|| chr=='i'|| chr=='o'|| chr=='u')
        System.out.println("the  char is a vowel");
        else
            System.out.println("the enter char is  consonant");
    }

}
