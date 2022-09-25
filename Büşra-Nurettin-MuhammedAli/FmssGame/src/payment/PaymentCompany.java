package payment;

import customer.Customer;
import fmss_game.FmssGame;

public class PaymentCompany implements PaymentMethods {
    public static final PaymentCompany INSTANCE = new PaymentCompany();

    @Override
    public void payWithCreditCard(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        FmssGame.INSTANCE.getWallet().setTotal(FmssGame.INSTANCE.getWallet().getTotal() + quantity);
    }

    @Override
    public void payWithPhone(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        FmssGame.INSTANCE.getWallet().setTotal(FmssGame.INSTANCE.getWallet().getTotal() + quantity);
    }

    @Override
    public void payWithGiftCard(Customer customer, int quantity) {
        customer.getWallet().setTotal(quantity);
        customer.getWallet().setTotal(customer.getWallet().getTotal() - quantity);
        FmssGame.INSTANCE.getWallet().setTotal(FmssGame.INSTANCE.getWallet().getTotal() + quantity);
    }
}
