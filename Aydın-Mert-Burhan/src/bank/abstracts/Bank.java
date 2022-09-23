package bank.abstracts;

import bank.Payment;

public abstract class Bank implements Payment {

    String name;
    public Bank() {
    }

    @Override
    public boolean havale() {
        return true;
    }

    @Override
    public boolean krediKarti() {
        return true;
    }
}
