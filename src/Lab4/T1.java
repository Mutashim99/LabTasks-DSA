package Lab4;


public class T1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        System.out.println("Before swapping:");
        System.out.print("Array 1: ");
        for(int a1: arr1){
            System.out.print(a1 + " ");
        }
        System.out.println(" ");
        System.out.print("Array 2: ");
        for(int a2: arr2){
            System.out.print(a2 + " ");
        }
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("\nAfter swapping:");
        System.out.print("Array 1: ");
        for(int a1: arr1){
            System.out.print(a1 + " ");
        }
        System.out.println(" ");
        System.out.print("Array 2: ");
        for(int a2: arr2){
            System.out.print(a2 + " ");
        }
    }

}
