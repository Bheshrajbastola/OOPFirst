import java.util.Scanner;
public class Rectangle {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        int length;
        int breadth;

        System.out.print("enter the length : ");
        length= sc.nextInt();

        System.out.print("enter the breadth : ");
        breadth=sc.nextInt();

        int area=length * breadth;
        System.out.println("area of rectangle : "+area);


    }
}



