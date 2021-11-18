import java.util.Scanner;
public class UpperLower {


        public static void main(String []args){
            char ch;//variable declaration
            Scanner sc=new Scanner(System.in);
            //create a scanner object for input

            System.out.println("Enter the character for find case ");
            ch=sc.next().charAt(0);// store the input from the user
            
            if(ch>=65 && ch<=90){

                System.out.println(ch+" is an upper case letter ");
            }
            else if(ch>=97 && ch<=122){
                System.out.println(ch+" is a lower case letter ");
            }
            else{
                System.out.println(ch+" is not an Alphabets ");
            }
        }
    }

