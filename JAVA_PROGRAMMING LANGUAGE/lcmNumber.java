import java.util.Scanner;

public class lcmNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        int lcm=lcm(a, b);
        System.out.println("LCM oF Two Number : " + lcm);


    }
    public static int lcm(int a ,int b){
        int i=1;
        while (i<=b) {
        int factor=a*i;
        if(factor% b==0){
            return factor;
        }
        i++;
        }

        return 0; // unreachable
    }
    
}
