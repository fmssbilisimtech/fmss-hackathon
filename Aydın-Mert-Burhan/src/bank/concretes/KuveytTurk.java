package bank.concretes;

import bank.abstracts.Bank;

public class KuveytTurk extends Bank {
    @Override
    public boolean havale() {
        return true;
    }

    @Override
    public boolean krediKarti() {
        return true;
    }
}