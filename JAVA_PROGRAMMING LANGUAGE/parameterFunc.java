public class parameterFunc {
    public static void main(String[] args) {
        int num=sumToNUmber(12, 15);
        System.out.println("Total:"+num);
        System.out.println(sumToNUmber(898, 896));

        System.out.println(sumToNUmber(10, 896));

        System.out.println(sumToNUmber(45, 88));
        
    }
    public static int    sumToNUmber (int first , int second) {
        System.out.println("Fisrt number:"+first);
        System.out.println("Second number:"+second);
        //int sum = first +second;
        return first +second;   
    }
    
}
