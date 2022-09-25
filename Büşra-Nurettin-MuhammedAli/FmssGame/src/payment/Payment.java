package payment;

import customer.Customer;

public class Payment {
    public static void pay(int select, Customer customer) {
        switch (select) {
            case 1 -> PaymentCompany.INSTANCE.payWithCreditCard(customer, customer.getCart().getTotal());
            case 2 -> PaymentCompany.INSTANCE.payWithPhone(customer, customer.getCart().getTotal());
            case 3 -> PaymentCompany.INSTANCE.payWithGiftCard(customer, customer.getCart().getTotal());
        }
    }
}
