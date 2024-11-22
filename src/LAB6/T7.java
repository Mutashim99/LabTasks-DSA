package LAB6;

public class T7 {
    public static void checkLowBalance(double balance, double threshold) {
        if (balance < threshold) {
            System.out.println("Alert: Account balance is critically low! Current balance: " + balance);
        } else {
            System.out.println("Account balance is safe. Current balance: " + balance);
        }
    }
    public static void main(String[] args) {
        double threshold = 100.0;
        System.out.println("Test 1: Balance = 50.0");
        checkLowBalance(50.0, threshold);
        System.out.println("Test  2: Balance = 150.0");
        checkLowBalance(150.0, threshold);
        System.out.println("Test 3: Balance = 99.99");
        checkLowBalance(99.99, threshold);
        System.out.println("Test  4: Balance = 100.0");
        checkLowBalance(100.0, threshold);
    }
}
