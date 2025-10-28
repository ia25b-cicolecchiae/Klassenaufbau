package exercise4;

public class BankAccount {

    public double balance;
    public String firstName;
    public String surName;
    public int accountNumber;
    public int limit;

    public BankAccount(String firstName, String surName, int accountNumber, double balance, int limit) {
        this.firstName = firstName;
        this.surName = surName;
        this.accountNumber = accountNumber;
        this.limit = limit;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        boolean schalter = true;
        while (schalter) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Du hast nicht genug Geld zum auszahlen");
                schalter = false;
            }
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void printBalance() {
        System.out.println(balance);
    }

    public String toString() {
        return firstName + " " + surName + " " + accountNumber + " " + limit + " " + balance;
    }

}
