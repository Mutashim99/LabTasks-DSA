package Lab4;

import java.util.Arrays;


public class T8 {
    public int[][] findCombinations(int[] numbers, int target) {
        int maxResults = 100;
        int[][] results = new int[maxResults][numbers.length];
        int[] currentCombo = new int[numbers.length];
        int comboCount = 0;

        Arrays.sort(numbers);
        comboCount = search(numbers, target, 0, 0, currentCombo, results, comboCount);

        int[][] finalResults = new int[comboCount][];
        for (int i = 0; i < comboCount; i++) {
            int comboLength = 0;
            while (comboLength < results[i].length && results[i][comboLength] != 0) {
                comboLength++;
            }
            finalResults[i] = Arrays.copyOf(results[i], comboLength);
        }
        return finalResults;
    }

    public int search(int[] numbers, int target, int start, int comboIndex, int[] currentCombo, int[][] results, int comboCount) {
        if (target == 0) {
            System.arraycopy(currentCombo, 0, results[comboCount], 0, comboIndex);
            return comboCount + 1;
        }
        for (int i = start; i < numbers.length; i++) {
            if (numbers[i] > target) break;
            currentCombo[comboIndex] = numbers[i];
            comboCount = search(numbers, target - numbers[i], i + 1, comboIndex + 1, currentCombo, results, comboCount);
        }
        return comboCount;
    }

    public static void main(String[] args) {
        T8 t = new T8();
        int[] numbers = {2,4,6,7,8,9};
        int target = 10;

        int[][] results = t.findCombinations(numbers, target);

        System.out.println(Arrays.deepToString(results));
    }
}
