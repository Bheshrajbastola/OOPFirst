import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            float p, t ,r,SI;


            System.out.print("enter the principle : ");
            p= sc.nextFloat();

            System.out.print("enter the time : ");
            t= sc.nextFloat();

            System.out.print("enter the rate : ");
            r= sc.nextFloat();

            SI=(p*t*r)/100;
            System.out.println("the SI is :"+SI);



        }
}
