import java.util.Scanner;
class challange_15{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("this is positive !");
        }
       else if (n<0) 
        {
            System.out.println("this is negative !");
        }
        else
        {
            System.out.println("Zero !");
        }
    }
}