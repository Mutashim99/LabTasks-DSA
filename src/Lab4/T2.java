package Lab4;

public class T2 {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arrmerge = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrmerge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrmerge[arr1.length + i] = arr2[i];
        }
        return arrmerge;
    }
    public static void main(String[] args) {
        int[] arr1 = {99,88,77,55};
        int[] arr2 = {81,91,71,51};
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
