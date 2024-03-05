import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Welcome To Delete Checker \n  :");
        int[]numArr= ArrayUtility.inputArray();
        System.out.print(" Enter Your NUmber Which you want to delete  :");
        int numToDelete =sc.nextInt();
        int[] newArr=  deleteNumber(numArr , numToDelete);
        System.out.print("Here is new Array :");
        ArrayUtility.display(newArr);
    }

    public static int[] deleteNumber( int [] numArr,int numToDelete){
        int occ=occuranesArray.checkOccrences(numArr, numToDelete);
        if(occ==0){
            return numArr;
        }
        int newSize=numArr.length - occ;
        int[] newArr=new int[newSize];

        int i=0 ,j=0;
        while (i<numArr.length) {
            if(numArr[i] != numToDelete){
                newArr[j]= numArr[i];
                j++;
            }
            i++;
        }
    return  newArr;
    }
          
}
