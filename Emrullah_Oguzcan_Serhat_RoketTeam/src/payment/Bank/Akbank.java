package payment.Bank;

import java.util.Random;

public class Akbank extends PayByBank {

    @Override
    public boolean pay(double discount) {
        if (rand.nextInt() % 2 == 1)
            return true;
        return false;
    }
}
