import java.util.Scanner;

public class trevarsal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={44,88,66,3,5,7,8,84,23,7,99,32,12,87,67};
         System.out.println("Enter Your Array Number :");  
        int num=sc.nextInt();
        boolean isFound=arrayFuc(arr, num);
        if(isFound){
            System.out.println("This is Present in Array !");
        }
        else{
            System.out.println("This is not present in  Array !");
        }

    }

    public static boolean arrayFuc(int[] arr ,int num){

        int index=0;
        while(index < arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;

    }
    
}
