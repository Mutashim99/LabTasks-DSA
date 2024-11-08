package Lab4;

public class T3 {
    public static void main(String[] args) {
        String[] words = {"madam","DATA STRUCTURE" ,"racecar", "level" ,"Muhtashim"};
        for (String word : words) {
            if (Palindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
    public static boolean Palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
