//Create a program to calculate Compound interest.Compound Interest = P(1 + R/100)t

import java.util.Scanner;
public class challange_13 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER P:");
        int p=sc.nextInt();
        System.out.println("ENTER R:");
        int r=sc.nextInt();
        System.out.println("ENTER T:");
        int t=sc.nextInt();

        int compound_Interest = p*(1+r/100)*t;
        System.out.println("compound_Interest::"+ compound_Interest);



    }
    
}