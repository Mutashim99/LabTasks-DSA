package LAB2;

import java.util.ArrayList;

class T6{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list1.addAll(list2);

        System.out.println("Merged list: " + list1);
    }
}