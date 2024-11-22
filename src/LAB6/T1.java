package LAB6;

public class T1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int v = (int) Math.floor(Math.random() * 100001);
            arr[i] = v;
        }
        int count = 1;
        for(int a : arr){
            if(a < 10000){
                System.out.println("Account No." + count + " Low Balance");
            }
            count++;
        }
    }
}
