import java.util.List;
import java.util.Scanner;

public class GameManager {


    public static GameManager gameManager;


    private GameManager() {
    }

    public static GameManager getInstance() {
        gameManager = new GameManager();
        return gameManager;
    }

    public void addGameToFmssGameList(String gameName, GameCompany company) {

        Game game = getGameFromListWithName(gameName, company.getList());
        FmssCompany.gameList.add(game);

    }

    public Game getGameFromListWithName(String name, List<Game> list) {
        Game game = null;
        for (Game g : list) {
            if (g.getName().equalsIgnoreCase(name)) {
                game = g;
            }
        }
        if (game == null) {
            try {
                throw new Exception("this game is not here");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return game;
    }

    public void salerGame(User user, Game game, PaymentCompany paymentCompany, PaymentType type) {
        Scanner input = new Scanner(System.in);

        while (!control(user.getBalance(), game.getPrice())) {
            try {
                throw new Exception("balance not enough");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("enter the balance amount please");
                double balanceAmount = Double.parseDouble(input.next());
                paymentCompany.addBalance(user, balanceAmount);
            }
        }

        if (type == PaymentType.CREDITCARD) {
            paymentCompany.creditCard(user, game.getPrice());
        } else {
            paymentCompany.eft(user, game.getPrice());
        }
        user.setGame(game);

    }

    public boolean control(double userBalance, double gamePrice) {
        boolean isTrue = true;

        if (userBalance < gamePrice ? isTrue = false : isTrue) ;
        return isTrue;
    }

}
