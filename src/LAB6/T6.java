package LAB6;

public class T6 {
    public static void main(String[] args) {
        int[] A = {55, 1, 0, 1, 0, 4, 4, 0, 1, 3};
        occurrences(A);
    }
    public static void occurrences(int[] A) {
        for (int i = 0; i < A.length; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    alreadyCounted = true;
                    break;}}
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < A.length; k++) {
                    if (A[k] == A[i]) {
                        count++;}}
                System.out.print(A[i] + " " + count );
                System.out.println(" ");
            }}}
        }
