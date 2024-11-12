package LAb1;

public class T7 {
    public static void main(String[] args) {
        int num = 123456789;
        Integer boxedNum = num;

        int evenCount = 0;
        int oddCount = 0;

        while(boxedNum != 0){
            int lastDigit = boxedNum % 10;
            if(lastDigit % 2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
            boxedNum = boxedNum /10;
        }
        System.out.println("EVEN NUMBERS ARE : " + evenCount);
        System.out.println("ODD NUMBERS ARE : " + oddCount);
    }
}