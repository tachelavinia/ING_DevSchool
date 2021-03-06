package ro.isr.devschool.atm.transaction;

import lombok.Getter;
import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Screen;

@Getter
public abstract class Transaction {
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }

    abstract public void execute();
}