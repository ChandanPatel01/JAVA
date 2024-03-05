import java .util.Scanner;
public class challange_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your  Hindi marks :");
        int a=sc.nextInt();
        
        System.out.println("Enter Your  English marks :");
        int b=sc.nextInt();

        System.out.println("Enter Your  Physics marks :");
        int c=sc.nextInt();

        System.out.println("Enter Your  Chemistry marks :");
        int d=sc.nextInt();

        System.out.println("Enter Your  Math marks :");
        int e=sc.nextInt();

        int Total_Marks= a+b+c+d+e;

        System.out.println("Your Total_Marks : " + Total_Marks);
        
        int Persentage= (Total_Marks*100)/500;

        System.out.println("Your Persentage :"+Persentage+"%");

        if(Persentage>=90)
        {
            System.out.println("YOUR GRADE IS A");
        }
        else if(Persentage>=75)
        {
            System.out.println("YOUR GRADE IS B");
        }
        else if(Persentage>=60)
        {
            System.out.println("YOUR GRADE IS C");
        }
        else if(Persentage>=30)
        {
            System.out.println("YOUR GRADE IS D");
        }
        else if(Persentage<30)
        {
            System.out.println("SORRY ! YOU ARE FAIL ");
        }
        else
        {
            System.out.println("THANKYOU !");
        }
    }
}
