public class reverseArray {
    public static void main(String[] args) {
        System.out.println("   Welcome to  Reverse Array!");

        int[] numArr=ArrayUtility.inputArray();
       reverse(numArr);
       System.out.println( "Your Reverse Array !");
       ArrayUtility.display(numArr);


    }


    public static void  reverse(int [] arr){
      int i=0;
      while (i<arr.length /2) {
       int swap=arr[i];
       arr[i]= arr[(arr.length-1)-i];
       arr[(arr.length-1)-i]=swap;

        i++;
      }

    }
       
}
