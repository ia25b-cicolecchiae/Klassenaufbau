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
        if (amount > balance) {
            System.out.println("Du hast nicht genug Geld zum auszahlen");
        } else if (amount > limit) {
            System.out.println("Das Limit darf nicht überschritten werden");
        }else{
            balance -= amount;
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
