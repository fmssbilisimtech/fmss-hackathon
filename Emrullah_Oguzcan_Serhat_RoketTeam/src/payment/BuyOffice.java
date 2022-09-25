package payment;

import Controller.FmssGame;
import User.User;
import User.SubscriptionType;
import game.Game;

public class BuyOffice {
    public static void buyGame(User user, PaymentType paymentType, Game game) {
        double discount = user.getSubscription().getSubscriptionDiscount();
        if (game.isGameFree()) {
            FmssGame.addGame(user, game);
        } else {
            if (paymentType.pay(discount)) {
                FmssGame.addGame(user, game);
                System.out.println("Satın alma başarılı.");
            } else {
                System.out.println("Satın alım başarısız");
            }
        }
    }

    public static void buySubscription(User user, SubscriptionType subscriptionType , PaymentType paymentType) {
        double discount = user.getSubscription().getSubscriptionDiscount();
        if (paymentType.pay(discount)) {
            FmssGame.addSubscription(user, subscriptionType);
            System.out.println("Subscription: Satın alma başarılı.");
        } else {
            System.out.println("Satın alım başarısız");
        }

    }

    public static void buyWalletBalance(User user, PaymentType paymentType, double balance) {
        if (paymentType.pay()) {
            FmssGame.addWalletBalance(user, balance);
            System.out.println("Satın alma başarılı.");
        } else {
            System.out.println("Satın alım başarısız");
        }
    }
}
