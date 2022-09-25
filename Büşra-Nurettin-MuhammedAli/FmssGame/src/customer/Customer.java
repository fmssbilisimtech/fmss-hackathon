package customer;

import games.Game;
import packages.Paket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer {
    private final int id;
    private Paket paket;
    private final Wallet wallet;
    private final List<Game> games;
    private final Cart cart;

    public Customer() {
        Random r = new Random();
        id = r.nextInt();
        wallet = new Wallet(id);
        cart = new Cart();
        games = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Paket getPaket() {
        return paket;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public List<Game> getGames() {
        return games;
    }

    public Cart getCart() {
        return cart;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    public void sendGame(Game game, Customer customer) {
        customer.games.add(game);
    }

    public void sendMoney(int money, Customer customer) {
        this.wallet.setTotal(this.wallet.getTotal() - money);
        customer.wallet.setTotal(customer.wallet.getTotal() + money);
    }

}
