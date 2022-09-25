package payment.Bank;

public class Denizbank extends PayByBank {
    @Override
    public boolean pay(double discount) {
        if (rand.nextInt() % 2 == 1)
            return true;
        return false;
    }
}
