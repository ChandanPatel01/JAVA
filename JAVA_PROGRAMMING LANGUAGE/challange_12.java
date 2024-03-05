
// simple intrest
import java.util.Scanner;
public class challange_12 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER P:");
        int p=sc.nextInt();
        System.out.println("ENTER R:");
        int r=sc.nextInt();
        System.out.println("ENTER T:");
        int t=sc.nextInt();

        int Simple_Interest = (p*t*r)/100;
        System.out.println("Simple_Interest::"+ Simple_Interest);



    }
    
}
