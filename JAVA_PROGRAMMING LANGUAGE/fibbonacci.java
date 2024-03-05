
// FOBBONACCI SERIES LIKE ADDTITON HOTA HAI FOR EXAMPLE
//  0 +1=1 ,1+1=2 ,1+2=3 ,2+3=5 ,3+5=8 ,5+8= 13 , ............. MALTB KI PHLE JO VALUE SECOND VALUE HAI BO ADDTION HUE VALUE ME ADD HOGI 
// USI TARAH 


import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        int num=fibbonacci_Series(n);
        System.out.println("this is Series:" + num);

    }
    
    public static int fibbonacci_Series(int num){
         int a=0,b=1;
        int sum=0; /// this is trird veriable;
        int i=0;
        while(i<=num){
           
            System.out.print(a +" ");
            sum=a+b;
            a=b;
            b=sum;
           
          i++;
        }


        
        
        return a;
    }
}
     
    
    


