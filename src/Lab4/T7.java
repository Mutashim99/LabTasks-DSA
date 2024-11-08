package Lab4;

public class T7 {
    public static void main(String[] args) {
        int[] numbers = {100,20,898,70,98,99,875,};
        int key = 98;
        splitArrayAtKey(numbers, key);
    }
    public static void splitArrayAtKey(int[] numbers, int key) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] part1 = new int[index + 1];
            int[] part2 = new int[numbers.length - index - 1];
            System.arraycopy(numbers, 0, part1, 0, index + 1);
            System.arraycopy(numbers, index + 1, part2, 0, part2.length);

            System.out.print("Array before and with the key " + key + ": ");
            for (int num : part1) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Array after the key " + key + ": ");
            for (int num : part2) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
