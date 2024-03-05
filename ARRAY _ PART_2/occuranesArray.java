import java.util.Scanner;

public class occuranesArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("<< Welcome to Occurence Checker >>");
        int [] numArray=ArrayUtility.inputArray();
        System.out.print("Enter your Number Which is you want check :");
        int n=sc.nextInt();
        int total_occurs=checkOccrences(numArray, n);
        System.out.println("total : " + total_occurs  + " Times ");

    }
     public static int checkOccrences( int [] numArray, int n){
        int i=0;
        int count=0;
        while (i<numArray.length) {
              if(numArray[i]==n){
                count=count+1;
                
                // count++;
                }
                i++;
        }   

        return count;
     }
    
}
