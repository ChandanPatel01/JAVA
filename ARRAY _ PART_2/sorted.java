public class sorted {
    public static void main(String[] args) {
        System.out.println("Welcome To Array Shorted ChckePost:  ");
        int [] numArr=ArrayUtility.inputArray();

        boolean isInc=isDecreseing(numArr);
        boolean isDec=isIncresing(numArr);
        if(isInc || isDec){
            System.out.println("Your Array is Shorted !");
        }
         else{
            System.out.println("Your Array iS not  shorted!");
         }


    }
       public static boolean isDecreseing(int[] numArr){
        int i=1;
        while(i<numArr.length){
        if(numArr[i] > numArr[i-1]){
             return false;
        }
           
            i++;
        }


        return true;

       }

        public static boolean isIncresing(int [] numArr){

            int i=1;
            while(i<numArr.length){
            if(numArr[i] <numArr[i-1]){
                 return false;
            }
               
                i++;
            }


            return true;
        }
}
