public class Troy implements PaymentCompany{
    public static Troy troy;

    private Troy() {
    }

    public static Troy getInstance(){
        troy = new Troy();
        return troy;
    }

    @Override
    public String getName() {
        return "Troy";
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
