import java.util.Scanner;
public class challange_19 
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number :");
    int n=sc.nextInt();
    if(n%4==0)
    {
        System.out.println("your are leap year :");
    }
    else
    {
        System.out.println("not leap year");
    }
    
    
  }
}
