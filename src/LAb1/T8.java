package LAb1;

public class T8 {
    public static void main(String[] args) {
        double num = 25.0;
        double exponent = 3.0;
        Double boxedNum = num;
        Double boxedExponent = exponent;

        System.out.println("Absolute value: " + Math.abs(boxedNum));
        System.out.println("Square root: " + Math.sqrt(boxedNum));
        System.out.println("Power: " + Math.pow(boxedNum,
                boxedExponent));
    }
}