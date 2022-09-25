package User;

import game.Game;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private double walletBalance;

    Subscription subscription = new Subscription();

    public List<Game> library = new ArrayList<>();

    public User(int id, String name, double walletBalance, List<Game> library) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.library = library;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void addWalletBalance(double walletBalance) {
        this.walletBalance += walletBalance;
    }

    public boolean doYouHaveAGame(Game game) {
        return library.contains(game);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(name).append(" balance:").append(walletBalance).append(" \n\tsubscription type: ").append(subscription.subscriptionType).append(" expire date: ").append(subscription.endSubscription);

        library.forEach(t -> sb.append("\n\t").append(t.title));
        return sb.toString();
    }
}
