public interface PaymentCompany {

    String getName();
    void creditCard(User user, double amount);
    void eft(User user, double amount);
    void updateBalance(User user, double amount);
    void addBalance(User user, double amount);
}
