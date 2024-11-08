package Lab4;

public class T4 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,11,6,32,66,16,91,96};
        int evenCount = 0;
        int oddCount = 0;
        for (int arrs:arr) {
            if (isEvenOrOdd(arrs)) {
                evenCount++;
            }
            oddCount++;
        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }
    public static boolean isEvenOrOdd(int n) {
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
