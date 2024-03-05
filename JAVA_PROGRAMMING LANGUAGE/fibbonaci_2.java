import java.util.Scanner;

public class fibbonaci_2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:   ");
        int num=sc.nextInt();
       
        System.out.println("this is Series:" );
        fibbonacci_Series(num);

    }
    
    public static int fibbonacci_Series(int num){

        if(num <0) return 0 ;
        System.out.print(" 0 ");

        if( num==0) return  0; 

        System.out.print("1 ");
     int third=0;
        int first =0;
      int   second=1;
        while(first+ second<=num)
        {
            third =first+second;
            System.out.print( third + " ");
            first=second;
            second=third;

        }
        return third;
        
    }
    
}
