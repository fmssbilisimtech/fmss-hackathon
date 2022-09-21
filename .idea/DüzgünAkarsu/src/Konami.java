import java.util.ArrayList;
import java.util.List;

public class Konami implements GameCompany {

    public  List<Game> gameList = new ArrayList<>();

    public static Konami konami;

    private Konami() {
    }

    public static Konami getInstance(){
        konami = new Konami();
        return konami;
    }

    public void addGameList(Game game){
        gameList.add(game);
    }

    public  Game getGameFromListWithId(int id){
        Game game=null;
        for (Game g :  gameList) {
            if(g.getId() == id){
                game = g;
            }
        }
        return game;
    }
    public  Game getGameFromListWithName(String name){
        Game game=null;
        for (Game g :  gameList) {
            if(g.getName().equalsIgnoreCase(name)){
                game = g;
            }
        }
        return game;
    }

    @Override
    public String getName() {
        return "Konami";
    }

    @Override
    public List<Game> getList() {
        return this.gameList;
    }


}
