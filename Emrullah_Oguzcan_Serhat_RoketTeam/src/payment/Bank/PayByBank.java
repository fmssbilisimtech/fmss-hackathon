package payment.Bank;

import payment.PaymentType;

import java.util.Random;

public abstract class PayByBank implements PaymentType {
    Random rand = new Random();

    public boolean pay() {
        return pay(0);
    }
    public abstract boolean pay(double discount);
}
