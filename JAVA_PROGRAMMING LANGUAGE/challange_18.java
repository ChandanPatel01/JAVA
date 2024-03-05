import java.util.Scanner;

public class challange_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        
        int age =sc.nextInt();
        if(age<=13)
        {
            System.out.println("CHILD");
        }
        else if(age<=20)
        {
            System.out.println("TEEN");
        }
        else if(age <=60)
        {
            System.out.println("ADULT");
        }
        else 
        {
            System.out.println("SENOIR");
        }
}
}