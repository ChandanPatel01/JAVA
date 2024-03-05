import java.util.Scanner;

public class ArrayUtility {
    
    public static int [] inputArray(){
        Scanner input=new Scanner(System.in) ;
        System.out.print("Please Enter The Number of Elements : ");
        int size=input.nextInt(); /// ye value ko scanner se scan kr rha  foerword kr rha 
        int[]nums= new int[size]; // yha store ho rhi h
        int i =0;
        while (i<size) {
            System.out.print("Plese Enter Your No " + (i+1) + " :");
            nums[i]=input.nextInt();
            i++; // 
            
    }
    return nums;
}

 public static void display(int[]numArray){
   
    int i=0;
    while ( i<numArray.length) {
        System.out.print(numArray[i] + " ");

        i++;
    }
    System.out.println(" ");
 }


 public static int [] [] input2DaRRAY(){
    Scanner input=new Scanner(System.in) ;
    System.out.print("Please Enter  your Rows : ");
    int rows=input.nextInt(); 
    System.out.print("Please Enter Your Column :");
    int column=input.nextInt();
   int[][] numArray=new int[rows][column];
    int i =0;
    while (i<rows) {
        int j=0;
        while (j< column) {
            System.out.print("Plese Enter  elements Rows :  " + (i+1) + ", column :" + (j+1) + ":"  );
            numArray[i][j]=input.nextInt();
            j++;
        }
        
        i++; // 
        
}
return numArray;
 }


}