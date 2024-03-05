import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num=sc.nextInt();
        int Reverse=ReverseOfNumber(num);
        System.out.println("This is your Reverse:" + Reverse);
        
    }
    
    public static int ReverseOfNumber(int num){
        int newNum=0;
        while (num>0) {
            int digit=num%10;
            newNum=newNum*10+digit;
            num=num/10;
        }


        return newNum;
    }
    
}
