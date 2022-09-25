import game.Game;

import java.util.ArrayList;
import java.util.List;

public class User {
    long id;
    double balance;
    List<Game> library = new ArrayList<>();
    Membership membership;

    public User(long id, double balance, Membership membership) {
        this.id = id;
        this.balance = balance;
        this.membership = membership;
    }
    public boolean oyunSatinAl(long gameId) {
        Game game = null;

        for (int i = 0; i < FmssGame.library.size(); i++) {
            if (FmssGame.library.get(i).id == gameId) {
                game = FmssGame.library.get(i);
                break;
            }
        }

        if (game != null) {
            if (game.price > this.balance) {
                System.out.println("Yetersiz bakiye");
                return false;
            } else {
                this.library.add(game);
                double disPrice = (game.price)-(game.price*this.membership.discount);
                balance = balance-(disPrice);
                System.out.println("Oyunu basariyla satin aldiniz");
                return true;
            }
        }
        System.out.println("Bir sorun olustu");
        return false;
    }
    public void giftGame(){
        System.out.println("Lutfen hediye etmek istediginiz kullanicinin id sini giriniz");
        long id = Long.parseLong(FmssGame.SingletonScanner.SCANNER.giris.nextLine());
        long gameId = FmssGame.listGamesAndReturnChose();
        User user = FmssGame.findUserById(id);
        Game game = FmssGame.findGameById(gameId);
        if(this.oyunSatinAl(gameId)){
            user.library.add(game);
            //oyun kendi listesinden silinecek
        }else {
            //hata mesaji bastirilacak
        }
    }

    public long listUserGameAndReturnChose(){
        System.out.println("Lutfen oynamak istediginiz oyunun id sini giriniz!");
        for (int i = 0;i<library.size();i++)
            System.out.printf("%s %s", library.get(i).gameName,library.get(i).id);
        long gameId = Long.parseLong(FmssGame.SingletonScanner.SCANNER.giris.nextLine());
        return gameId;
    }

    public boolean buyMembership(Membership membership){
        this.membership = membership;
        return true;
    }
}
