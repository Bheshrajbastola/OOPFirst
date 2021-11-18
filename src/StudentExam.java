    import java.util.Scanner;
    public class StudentExam {

        public static void main(String[] args) {
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("no of classes held");
                int x = sc.nextInt();

                System.out.println("no of classes attend");
                int y = sc.nextInt();
                float pf;
                pf = (y / x) * 100;

                if (pf >= 75)
                    System.out.println("eligible:" + pf);
                else
                    System.out.println(" not eligible:" + pf);
            }
        }
    }

