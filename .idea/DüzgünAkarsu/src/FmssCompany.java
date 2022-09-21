import java.util.ArrayList;
import java.util.List;

public class FmssCompany {
    static GameManager gameManager = GameManager.getInstance();

    public static List<Game> gameList = new ArrayList<>();

    public static List<User> userList = new ArrayList<>();



    public static void setBalance(User user, double amount, PaymentCompany paymentCompany) {
        paymentCompany.addBalance(user, amount);
    }



    public static void sallerGames(User user, Game game, PaymentCompany paymentCompany, PaymentType type) {
            gameManager.salerGame(user, game, paymentCompany, type);

    }
}
