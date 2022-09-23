package payment;

import customer.Customer;

public interface PaymentMethods {
    void payWithCreditCard(Customer customer, int quantity);

    void payWithPhone(Customer customer, int quantity);

    void payWithGiftCard(Customer customer, int quantity);
}
