//Create a program to calculate the Area of a Triangle.Area of triangle = ½*B*H

import java.util.Scanner;
public class challanhe_11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter B:");
        int b =sc.nextInt();
        System.out.println("Enter H:");
        int h=sc.nextInt();

        int triangle = 1*b*h/2;
        System.out.println("Total:"+triangle);
    }
}