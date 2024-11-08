package Lab4;
public class T9 {
    public static int missingNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,5,6,7};

        System.out.println("The missing Number in series is : "+ missingNumber(arr));
    }
}
