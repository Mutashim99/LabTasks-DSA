package Lab4;

public class T6 {
    public static void main(String[] args) {
        float[] arr = {1f,1.8f,2.8f,9.0f,8.8f,7.7f,6.6f,5.0f,4.4f,3.3f};
        float sum = 0;
        float mean = 0;
        for(float x : arr){
            sum += x;
        }
        mean = sum/arr.length;
        System.out.println("The Sum is " + sum);
        System.out.println("The mean is " + mean);
    }
}
