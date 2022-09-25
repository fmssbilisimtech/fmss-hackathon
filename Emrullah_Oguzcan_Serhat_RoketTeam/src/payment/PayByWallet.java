package payment;

import java.util.Random;

public class PayByWallet implements PaymentType{
    Random rand = new Random();



    public boolean pay(double discount) {
        if (rand.nextInt() % 2 == 1)
            return true;
        return false;
    }

    @Override
    public boolean pay() {
        return pay(0);
    }
}
