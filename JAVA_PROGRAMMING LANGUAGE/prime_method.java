import java.util.Scanner;

public class prime_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int a=sc.nextInt();
        boolean isPrime=primeNumber(a);
        if(isPrime){
            System.out.println("Your Number is prime");
        }
        else 
        {
            System.out.println("Your number is not prime");
        }
        
    }
    public static boolean primeNumber(int num)
    {
        int i=1;
        while (i<num) {
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    
}
