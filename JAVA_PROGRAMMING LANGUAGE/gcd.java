import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Second Number::");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int gcd=gcdLogic(a, b);
        System.out.println("This is your gcd :: " + gcd);
    }

    public static int gcdLogic(int a,int b){
        int gcd=1;
        int i=2;
        int least=least(a, b);
        while(i<=least){

            if(a %i==0 && b%i==0) {

                gcd =i;
            }
            i++;
        }

        return gcd;
    }

    public static int   least(int a ,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
}
