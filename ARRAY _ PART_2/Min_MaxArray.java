public class Min_MaxArray {public static void main(String[] args) {
    System.out.println("<< MIX MAX CHECKER >>");
    int [] numArray=ArrayUtility.inputArray();
      int max=max(numArray);
      int min=min(numArray);
      System.out.println("THIS IS MAXIMUM NUMBER IN YOUR ARRAY : " + max);
      System.out.println("THIS IS MANIMUM NUMBER IN YOUR ARRAY : " + min);


}

   public static int min(int []number){
    int min=Integer.MAX_VALUE;
    int i=0;
    while (i<number.length) {
        if(i>number[i]){
        min=number[i];
        }
        i++;
    }
    

    return min;
   }


    
   public static int max(int [] number){
        if(number.length==0)
        {
            return Integer.MIN_VALUE;
        }

    int max=number[0];
    int i=1;
    while (i<number.length) {
        if(max<number[i]){
            max=number[i];
        }
        i++;
        
    }

     return max;
   }
}
