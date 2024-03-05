import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=sc.nextInt();
        long sum=sumOffDigit(num);
        System.out.println("sum of Digit : " + sum);

    }
     public static long sumOffDigit(int num)
     {
        int sum=
        0;
        if(num <= 9 ) return 0;
        while (num>0) {
            sum=sum+(num %10);
            num=num/10;
            
        }
        return sum;
     }
    
}
