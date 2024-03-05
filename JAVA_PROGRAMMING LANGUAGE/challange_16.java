import java.util.Scanner;
public class challange_16 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first Value :");
        int a=sc.nextInt();
        System.out.println("Enter first Value :");
        int b =sc.nextInt();
        System.out.println("Enter first Value :");
        int c=sc.nextInt();

        if(a>b && a>c )
        {
            System.out.println(a +    "  is Grester than  "+ b +  "  and  "  +c  );
        }
        else if(b>c && b>a)
        {
            System.out.println(b    +    "   is Greter than  "    + c + " and :"+a);
        }
        else if(c>a && c>b )
        {
            System.err.println(c +  "   C  is Greter than :  "  + a + "and " +b);
        }
        
        else if(a==b && b==c && c==a){
            System.out.println("Every Numbers are Equals ! ");
        }
        else{
            System.out.println("ThankYou !");
        }

        
    }
    
}
