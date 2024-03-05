import java.util.Scanner;

public class tableFunction {
    public static void main(String[] args) {
        System.out.println("Enter your NUMBER:");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        tableLogic( num);
        readLogic();
    }

       public static void readLogic(){

        System.out.println(" Hello  Bro Thanks !");
       
       }

    public static int   tableLogic(int num)
    {   
        int i=1;
        
        while(i<=10)
        {
           
            System.out.println( num+ "X" +i +"=" +(num*i)) ;
 
            i++;
           
          }
         
         return num;
}
}
