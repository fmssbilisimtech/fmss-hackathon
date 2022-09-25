package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int id;
    public String title;
    public double rating;
    public double price;
    public List<GameGenre> genres = new ArrayList<>();

    public Game(int id, String title, double rating, double price, List<GameGenre> genres) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.genres = genres;
    }

    public boolean isGameFree() {
        return price == 0;
    }
}
