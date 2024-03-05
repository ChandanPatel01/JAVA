

public class sum_AvarageArray {
    public static void main(String[] args) {
    System.out.println("<<< Welcome Come to Array Sum and Avarage >>>");
    int []numArray =ArrayUtility.inputArray();

       long sum=sumArray(numArray);
      double avarage =avarageArray(numArray);
       System.out.println("This is your Sum : " + sum);
       System.out.println("This is your Avarage : "  +avarage);
       
        }

    public static long sumArray(int[] numArray){

        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum=sum+numArray[i];
            i++;
        }
        return sum;
    }

    public static  double avarageArray (int [] numArray){

        double sum=sumArray(numArray);

      return(sum/numArray.length);
    }
    
}

