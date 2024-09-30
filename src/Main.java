import Entity.CurentAccount;
import Entity.BankAccount;
import Entity.SavingAccount;
public class Main {
    public static void main(String[] args) {
        double ibal, damt, wamt;
        ibal = 1000.00;
        SavingAccount savingsAccount = new SavingAccount("SA001", ibal);
        System.out.println("Savings A/c: Initial Balance: $" + ibal);
        damt = 500.00;
        savingsAccount.deposit(damt);
        wamt = 250.00;
        savingsAccount.withdraw(wamt);
        ibal = 1600.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
        System.out.println();
        ibal = 5000.00;
        CurentAccount currentAccount = new CurentAccount("CA001", ibal);
        System.out.println("Current A/c: Initial Balance: $" + ibal);
        damt = 2500.00;
        currentAccount.deposit(1000);
        wamt = 1250.00;
        currentAccount.withdraw(3000);
        wamt=6000;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);




    }
}