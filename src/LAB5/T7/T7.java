package LAB5.T7;

import java.util.Random;

public class T7 {
    public static int partition(BankAccount[] accounts, int low, int high) {
        int pivot = accounts[high].balance;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (accounts[j].balance > pivot) {
                i++;
                BankAccount temp = accounts[i];
                accounts[i] = accounts[j];
                accounts[j] = temp;
            }
        }
        BankAccount temp = accounts[i + 1];
        accounts[i + 1] = accounts[high];
        accounts[high] = temp;
        return i + 1;
    }
    public static void quickSort(BankAccount[] accounts, int low, int high) {
        if (low < high) {
            int pi = partition(accounts, low, high);
            quickSort(accounts, low, pi - 1);
            quickSort(accounts, pi + 1, high);
        }
    }

    public static void printAccounts(BankAccount[] accounts) {
        System.out.println("Account Number\tBalance");
        for (BankAccount account : accounts) {
            System.out.println(account.accountNumber + "\t\t" + account.balance);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        BankAccount[] accounts = new BankAccount[n];
        for (int i = 0; i < n; i++) {
            int accountNumber = 1000 + i;
            int balance = rand.nextInt(100001);
            accounts[i] = new BankAccount(accountNumber, balance);
        }
        quickSort(accounts, 0, accounts.length - 1);
        System.out.println("After Sorting:");
        printAccounts(accounts);
    }
}