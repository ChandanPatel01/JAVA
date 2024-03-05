//Create a program to convert Fahrenheit to Celsius °C = (°F - 32) × 5/9
import java.util.Scanner;
public class challanhe_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter F:");
        int f=sc.nextInt();
        
        int C = (f - 32)*5/9;
        System.out.println("Celsius °C "+C);
    }


    
}
