public class Iyzico implements PaymentCompany{

    public static Iyzico iyzico;

    private Iyzico() {
    }

    public static Iyzico getInstance(){
        iyzico = new Iyzico();
        return iyzico;
    }

    @Override
    public String getName() {
        return "Iyzico";
    }

    @Override
    public void creditCard(User user, double amount) {

        amount -= ((amount * user.getaPackage().discount) / 100);
        updateBalance(user,amount);
    }

    @Override
    public void eft(User user, double amount) {
        amount -= ((amount * user.getaPackage().discount) / 100);
        updateBalance(user,amount);
    }

    @Override
    public void updateBalance(User user, double amount) {
        user.setBalance(user.getBalance() - amount);
    }

    @Override
    public void addBalance(User user, double amount) {
        user.setBalance(user.getBalance() +amount);
    }
}
