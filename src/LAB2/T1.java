package LAB2;

import java.util.Vector;

public class T1 {
    public static void main(String[] args) {
        int sum=0;
        Vector<Integer> v = new Vector<>();
        for (int i=0;i<10;i++){
            v.add((int) (Math.random()*100));
        }
        System.out.println(v);
        for(int vector : v){
            sum+=vector;
        }
        System.out.println(sum);
    }
}