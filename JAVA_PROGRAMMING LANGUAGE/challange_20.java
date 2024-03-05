import java.util.Scanner;

public class challange_20 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Number:");
    int num=sc.nextInt();
    int sum= oddSum(num);
    System.out.println("ODD TILL "  + num  +  " is "  + sum);
    

}

public static int oddSum(int num){
   int sum=0;
   int i=1;
   while(i<=num){
     sum +=i;
     i +=2;
   }  
    return sum;
}
}
