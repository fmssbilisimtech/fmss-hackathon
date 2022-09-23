package games;

import java.util.ArrayList;
import java.util.List;

public class GameCompany {
    private final List<Game> games;

    public GameCompany() {
        games = new ArrayList<>();
        games.add(new Game(1, "Angry Birds", 0));
        games.add(new Game(2, "Auto Car", 300));
        games.add(new Game(3, "Minecraft", 250));
        games.add(new Game(4, "CS:GO", 500));
    }

    public List<Game> getGames() {
        return games;
    }
}
