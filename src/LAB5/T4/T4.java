package LAB5.T4;

public class T4 {
    public static int partition(Account[] accounts, int low, int high) {
        int pivot = accounts[high].balance;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (accounts[j].balance >= pivot) {
                i++;
                Account temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }
        }
        Account temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;

        return i + 1;
    }
    public static void quickSort(Account[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            quickSort(accounts, low, pi - 1);
            quickSort(accounts, pi + 1, high);
        }
    }
    public static void printAccounts(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Account No. " + account.accountNo + " Balance " + account.balance);
        }
    }
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(3547, 28000),
                new Account(1245, 12000),
                new Account(5412, 45000),
                new Account(7890, 10000),
                new Account(1234, 90000)
        };
        quickSort(accounts, 0, accounts.length - 1);
        printAccounts(accounts);
    }
}