package LAb1;

public class T6 {
    public static void main(String[] args) {
        int primitiveInt = 15;
        Integer autoboxInt = primitiveInt;
        int unboxedInt = autoboxInt;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + autoboxInt);
        System.out.println("Unboxed int: " + unboxedInt);


        String numberStr = "200";
        int number = Integer.parseInt(numberStr);

        System.out.println("Converted String to int using parseInt: " +
                number);

        String convertedStr = Integer.toString(number);
        System.out.println("Converted int to String using toString: " +
                convertedStr);
    }
}