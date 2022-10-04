public class Papara implements PaymentCompany{

    public static Papara papara;

    private Papara() {
    }

    public static Papara getInstance(){
        papara = new Papara();
        return papara;
    }

    @Override
    public String getName() {
        return "Papara";
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
