package database;

import Controller.FmssGame;
import game.*;
import User.*;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<User> users = new ArrayList<>();

    static {
        setDatabase();
    }

    public static void setDatabase() {

        FmssGame.games.add(new Game(0, "Fallout", 8.5, 60, List.of(GameGenre.ACTION)));
        FmssGame.games.add(new Game(1, "FallGuys", 8.5, 60, List.of(GameGenre.ACTION)));
        FmssGame.games.add(new Game(2, "Battlefield", 8.5, 60, List.of(GameGenre.ACTION)));
        FmssGame.games.add(new Game(3, "CounterStrike", 8.5, 0, List.of(GameGenre.ACTION)));

        users.add(new User(0, "Oguzcan", 155, List.of(gameById(1), gameById(2))));
        users.add(new User(1, "Emrullah", 5, new ArrayList<>()));
        users.add(new User(2, "Serhat", 15, List.of(gameById(2), gameById(0))));

    }

    public static Game gameById(int id) {
        return FmssGame.games.get(id);
    }
}
