//.Create a program to calculate Perimeter of a rectangle.Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;
 class challange_10 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of A:");
        int a=sc.nextInt();
        System.out.println("Enter value of B:");
        int b=sc.nextInt();
        System.out.println("Enter the value of C:");
        int  c=sc.nextInt();
        System.out.println("Enter the value of D:");
        int d=sc.nextInt();

        int retangle=a+b+c+d;

        System.out.println("Total"+retangle);

    }
    
}
