package chap6.exercise.exam19;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (Account.MIN_BALANCE > balance || Account.MAX_BALANCE < balance) {
            return;
        }
        this.balance = balance;
    }


    }
