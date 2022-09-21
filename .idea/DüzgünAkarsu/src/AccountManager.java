public class AccountManager {

    public static void printInfo(User user, Game game, GameCompany gameCompany, PaymentCompany paymentCompany){
        System.out.printf("userName : %s %s - userId : %s - userBalance: %s\nuserPackage : %s\nusage payment company: %s",
                user.getName(),user.getSurName(),user.getId(),user.getBalance(),user.getaPackage().name(), paymentCompany.getName());
    }
}
