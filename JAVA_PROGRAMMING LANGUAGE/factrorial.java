import java.util.Scanner;

public class factrorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num=sc.nextInt();
        long fact =facLogic(num);
      
       System.out.print("FACTROIAL OF  "  + num + "  is : " + fact);
    
    }
    public static long facLogic(int num){
       long  fact =1;
       int i=1;

       while(i<=num)
       {
            fact = fact *i; 
            i++;
       }
        return fact;
    }
    
}
