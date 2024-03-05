import java.util.Scanner;

public class evENOdd_bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        if((n&1)==1)
        {
            System.out.println("ODD");
        }
        else{

            System.out.println("EVEN");
        }
    }
    
}
