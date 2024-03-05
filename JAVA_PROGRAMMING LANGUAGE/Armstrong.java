import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number :");
        System.out.println("Enter Your Armstrong Number: ");
        int num=sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your Number is Armstrong");
        }
        else {
            System.out.println("Your Number is not Armstrong");
        }

        }

    public static boolean isArmstrong(int num){

        int noOfDidigit=noOfDidigit(num);
        int numCopy=num;
        int final_number=0;
        while (num>0) {
            int last_digit=num%10;
            num/=10;
            final_number +=pow(last_digit,noOfDidigit);

        }
        return final_number==numCopy;
    }



    public static int pow(int num1 , int num2){

         int result=1;
         int i=0;
           while (i<num2) {
            result=result*num1;
            i++;
           }
         return result;
    }



    public static int noOfDidigit(int num){
        int digits=0;
        while (num>0) {
            digits++;
            num /=10;
            
        }

        return digits;
    }

}
