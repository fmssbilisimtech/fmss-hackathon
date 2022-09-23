package fmss_game;

import customer.Wallet;
import games.Game;
import games.GameCompany;

import java.util.ArrayList;
import java.util.List;

public class FmssGame {
    public static final FmssGame INSTANCE = new FmssGame();

    private final List<Game> games;
    private final Wallet wallet;

    private FmssGame() {
        games = new ArrayList<>();
        games.addAll(fetchGamesFromCompany(new GameCompany()));
        wallet = new Wallet(-1);
    }

    private List<Game> fetchGamesFromCompany(GameCompany gameCompany) {
        return gameCompany.getGames();
    }

    public List<Game> getGames() {
        return games;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void runGame(Game game) {
        System.out.printf("%s oyunu çalıştırılıyor", game.getName());
    }
}
