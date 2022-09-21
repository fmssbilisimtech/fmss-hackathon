public class Ininal implements PaymentCompany{

    public static Ininal ininal;

    private Ininal() {
    }

    public static Ininal getInstance(){
        ininal = new Ininal();
        return ininal;
    }

    @Override
    public String getName() {
        return "Ininal";
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
