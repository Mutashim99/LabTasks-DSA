package LAb1;

public class T3 {
    public static void main(String[] args) {
        String str1 = "Sunrise";
        String str2 = "Mountains";
        String str3 = "Ocean";
        String str4 = "Adventure";
        String str5 = "Journey";

        String concatenatedString = str1 + " " + str2 + " " + str3 + " "
                + str4 + " " + str5;
        System.out.println("Concatenated String: " +
                concatenatedString);

        String upperCaseStr4 = str4.toUpperCase();
        System.out.println("Fourth String in Uppercase: " +
                upperCaseStr4);

        String substringFromConcatenated = concatenatedString.substring(8);
        System.out.println("Substring from index 8 onwards: " +
                substringFromConcatenated);
    }
}