import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=sc.nextInt();
        int isPlaindromeNumber=palindromeNumber(num);
        if (isPlaindromeNumber==num) {
            System.out.println(  num + "    : this is palindrome number "  );
        }
        else{
            System.out.println("This is not palindrome number");
        }

    }

    public static int palindromeNumber(int num){
        
          int sum=0;
        while (num>0) {
           int digit=num%10;
           sum=sum*10+digit;
           num=num/10;

            
        }
       
        return sum;
    
   
}
}
