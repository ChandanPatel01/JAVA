 class ArrayPalindrome{
    public static void main(String[] args) {
        int []numArr=ArrayUtility.inputArray();
        boolean isPalindrome=palindrome(numArr);
        if(isPalindrome){
            System.out.println("Palindrome Array!");
        }
        else{
            System.out.println("Not Palindrome!");
        }

    }

    public static boolean palindrome(int [] numArr){
          int i=0;
          while (i<numArr.length/2) {
            if(numArr[i]!=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
            
          }

        return true;
    }
}