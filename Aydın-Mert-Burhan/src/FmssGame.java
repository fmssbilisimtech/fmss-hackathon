import game.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FmssGame {

    public static void main(String[] args) {

        startApp();

    }

    public static void startApp(){
        FmssGame app = new FmssGame();
        app.fillUserList();
        app.fillGameList();

        long userId = app.chooseUser();//giris yapan kullanici id
        User currentUser = FmssGame.findUserById(userId);

        switch (app.showMenuAndSelectProcess()){
            case 1:
                long choosenGame = FmssGame.listGamesAndReturnChose();
                currentUser.oyunSatinAl(choosenGame);
                break;
            case 2:
                currentUser.giftGame();
                break;
            case 3:
                app.playGame(currentUser,1); // eksik
                break;
            case 4:
                currentUser.buyMembership(Membership.GOLD); //
                break;
            case 5:
                app.addBalanceToUser(currentUser);
                break;
            default:
                //
                break;
        }
    }

    public long chooseUser(){
        System.out.println("Lutfen kullanici id sini giriniz: ");
        long userId = Long.parseLong(SingletonScanner.SCANNER.giris.nextLine());
        return userId;
    }
    public int showMenuAndSelectProcess(){
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: \n" +
                "1)Oyun satin al \n" +
                "2)Oyun Hediye et \n" +
                "3)Oyun oyna\n" +
                "4)Paket satin al\n" +
                "5)Bakiye ekleme\n" +
                "6)Cikis yap");
        int choose= Integer.parseInt(SingletonScanner.SCANNER.giris.nextLine());
        return choose;

    }

    public static Game findGameById(long gameId){
        for (int i = 0; i < FmssGame.library.size(); i++) {
            if (FmssGame.library.get(i).id == gameId) {
                return FmssGame.library.get(i);
            }
        }
        return null;
    }
    public static User findUserById(long userId) {
        for (int i = 0; i < FmssGame.users.size(); i++) {
            if (userId == FmssGame.users.get(i).id) {
                return FmssGame.users.get(i);
            }
        }
        return null;
    }
    public static long listGamesAndReturnChose(){
        System.out.println("Lutfen almak istediginiz oyunun id sini giriniz!");
        for (int i = 0;i<library.size();i++)
            System.out.printf("%s %s\n", library.get(i).gameName,library.get(i).id);
        long gameId = Long.parseLong(SingletonScanner.SCANNER.giris.nextLine());
        return gameId;
    }

    public static List<Game> library = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    public void fillGameList(){
        Game game1 = new Game(1,"Lol",100,"Riot");
        Game game2 = new Game(2,"Cs",73,"Val");
        Game game3 = new Game(3,"Valorant",62,"Meryem");
        Game game4 = new Game(4,"Fifa",278,"EaGames");
        Game game5 = new Game(5,"Lnagirt",10,"Kazim");
        library.add(game1);
        library.add(game2);
        library.add(game3);
        library.add(game4);
        library.add(game5);
    }
    public void playGame(User user, long gameId){
        //
    }

    public void fillUserList(){
        User user1 = new User(1,1000,Membership.GOLD);
        User user2 = new User(2,500,Membership.SILVER);
        User user3 = new User(3,100,Membership.BRONZ);
        User user4 = new User(4,1000,Membership.DEFAULT);
        User user5 = new User(5,1000,Membership.GOLD);

        Game game1 = new Game(1,"Lol",100,"Riot");
        Game game2 = new Game(2,"Cs",73,"Val");
        Game game3 = new Game(3,"Valorant",62,"Meryem");
        Game game4 = new Game(4,"Fifa",278,"EaGames");
        Game game5 = new Game(5,"Langirt",10,"Kazim");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        user1.library.add(game1);
        user1.library.add(game2);
        user1.library.add(game3);
        user2.library.add(game1);
        user2.library.add(game5);
        user3.library.add(game4);
        user4.library.add(game3);
        user5.library.add(game2);
    }



    public enum SingletonScanner{
        SCANNER;
        Scanner giris = new Scanner(System.in);
    }

    public void addBalanceToUser(User user){
        System.out.println("Eklemek istediginiz miktari giriniz.");
        double x = Double.parseDouble(SingletonScanner.SCANNER.giris.nextLine());
        user.balance += x;
    }
}
