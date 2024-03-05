import java.util.Scanner;

public class digitSum{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your  Number :");
    int num=sc.nextInt();
    int sum=sumNumber(num);
    System.out.println("This is number " + num + " sum of "  +sum)  ;

}
public static int sumNumber(int num){
    int sum=0;
    int i=1;
    while(i<=num){
      sum=sum+i;
      i++;
    }

  return sum;
}

}