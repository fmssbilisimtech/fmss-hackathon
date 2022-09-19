package customer;

import games.Game;
import packages.Paket;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Game> list;
    private int total;

    public Cart() {
        list = new ArrayList<>();
    }

    public List<Game> getList() {
        return list;
    }

    public int getTotal() {
        return total;
    }

    public int calculateOrder(Paket paket) {
        for (Game game : list) {
            total += game.getPrice();
        }

        total -= (total * paket.getDiscountRate()) / 100;

        return total;
    }
}
