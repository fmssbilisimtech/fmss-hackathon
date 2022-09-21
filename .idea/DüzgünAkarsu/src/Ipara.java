public class Ipara implements PaymentCompany{
    public static Ipara ipara;

    private Ipara() {
    }

    public static Ipara getInstance(){
        ipara = new Ipara();
        return ipara;
    }

    @Override
    public String getName() {
        return "Ipara";
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
