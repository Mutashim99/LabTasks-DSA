package LAB2;

import java.util.ArrayList;

class T4{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0;i<10;i++){
            nums.add((int)(Math.random()*100));
        }
        System.out.println(nums);
        int sum =0;
        int max = 0;
        for(int numbers : nums){
            sum+=numbers;
            if(numbers > max){
                max = numbers;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("The maximum number is " + max);
    }
}