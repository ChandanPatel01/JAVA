 import java.util.Scanner;
 class swap {
    public static void main(String[] args)
     
    {
        int c;
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter Frist Number:");
          int a=sc.nextInt();
          System.out.println("Enter the Second Number:");
          int b=sc.nextInt();

          System.out.println("BEFORE SWAPPING  "+ a + " and "+ b);
         c=a;
         a=b;
         b=c;        
         System.out.println("AFTER SWAPPING  "+ a + " and "+ b);
    
        
    }
    
}
////THIS SWAPPING IS USING THIRD VARIABLE////
/// A=5 THIS EQUAL IS REPRESENT THE ASSIMENT OPRETOR //////
