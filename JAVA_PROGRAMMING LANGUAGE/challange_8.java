//Create a program that takes two numbers and shows result of all  arithmetic operators (+,-,*,/,%).
import java.util.Scanner;
public class challange_8 {
    public static void main(String[] args) {            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Value:");
        int a=sc.nextInt();
        System.out.println("Enter The Second Value:");
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int multi=a*b;
        int div=a/b;
        int mod=a%b;

        System.out.println("SUM:"+sum +"\nSUB:"+sub +"\nMULTI:"+multi+"\nDIV:"+div+"\nMOD:"+mod);
    }

    
}
