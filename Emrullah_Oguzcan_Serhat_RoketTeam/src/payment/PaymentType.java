package payment;

public interface PaymentType {
    boolean pay(double discount);
    boolean pay();
}
