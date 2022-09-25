package Controller;

import game.Game;

import java.util.ArrayList;

import User.*;
import game.GameController;

public class FmssGame {
    public static ArrayList<Game> games = new ArrayList<>();

    public static void addGame(User user, Game game) {
        user.library.add(game);
    }
    public static void addSubscription(User user, SubscriptionType subscriptionType) {
        user.getSubscription().setSubscriptionType(subscriptionType);
    }

    public static void addWalletBalance(User user, double balance) {
        user.addWalletBalance(balance);
    }

    public static void playGame(User user, Game game) {
        if (user.doYouHaveAGame(game)) {
            GameController.run(game);
        }
    }
}
