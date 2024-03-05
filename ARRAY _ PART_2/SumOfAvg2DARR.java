public class SumOfAvg2DARR {
    public static void main(String[] args) {
        System.out.println("Welcome Avgrage Calculator:");
        int numArr[][]=ArrayUtility.input2DaRRAY();
        long sum_1=sum(numArr);
       double avg_1=avg(numArr);
        System.out.println("This is your sum :" +sum_1);
        System.out.println("This is Your Avarrage :" +avg_1);

    }
     
    public static double avg( int [][]numArr){
        if(numArr.length==0){
            return 0;
        }
        //int rows=numArr.length;
        //int col=numArr[0].length;
        double size=numArr.length* numArr.length;
        
      return (sum(numArr)/size);
    }

    

public static long sum(int [][]numArr){
        int sum=0;
        int i=0;
        while (i< numArr.length) {
            int j=0;
            while (j< numArr[i].length) {
                sum = sum+numArr[i][j];
                j++;
                
            }
            i++;
            
        }

        return sum;



    }

     
    
}

