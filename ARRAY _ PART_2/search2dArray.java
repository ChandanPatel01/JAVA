import java.util.Scanner;

public class search2dArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Welcome 2D Search");
     int [][]numArr=ArrayUtility.input2DaRRAY();
     System.out.print("Now, Enter Your Number Which You want to Search : ");
     int num=sc.nextInt();
     boolean isFound=search(numArr, num);
     if(isFound){
        System.out.println("Your Number is Found :");
     }
     else{
        System.out.println("Your Number is not found:");
     }

        
    }
     public static boolean search(int[][] numArr,int num){
        int i=0;
        while (i< numArr.length) {
            int j=0;
            while (j<numArr[i].length) {
                if(numArr[i][j]==num){
                    return true;
                }
                j++;
            }
           i++; 
        }
       

        return false;
     }

    
}
