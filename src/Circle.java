import java.util.Scanner;
public class Circle {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int radius;
        double pi = 3.142, area;

        System.out.print("enter the radius :");
        radius=sc.nextInt();

        // calculating the area of the circle
        area = pi * radius * radius;
        // printing the area of the circle
        System.out.println("Area of circle is :" + area);
    }
}

