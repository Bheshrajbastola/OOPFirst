import java.util.Scanner;
public class Discount {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int quantity;
        System.out.println("enter the quantity :");

        quantity= sc.nextInt();

        if (quantity*100>1000) {
            System.out.println("You get a discount of " + (.1 * quantity * 100) + " and your total cost is " + (quantity * 100 - (.1 * quantity * 100)));
        }


        else{
            System.out.println("No discount");



        }

    }
}


