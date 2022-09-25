import Controller.FmssGame;
import User.User;
import database.Database;
import payment.Bank.Akbank;
import payment.BuyOffice;
import User.*;
import payment.PayByWallet;

public class Main {

    public static void main(String[] args) {
        User user = Database.users.get(1);

        System.out.println(user);
        System.out.println();

        BuyOffice.buySubscription(user, SubscriptionType.GOLD, new PayByWallet());
        System.out.println(user);

        System.out.println();

        BuyOffice.buyWalletBalance(user, new Akbank(), 1000);
        System.out.println(user);

        System.out.println();

        BuyOffice.buyGame(user, new PayByWallet(), Database.gameById(3));
        System.out.println(user);

        System.out.println();

        FmssGame.playGame(user, Database.gameById(3));
    }
}
