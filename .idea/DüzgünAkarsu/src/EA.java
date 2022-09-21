import java.util.ArrayList;
import java.util.List;

public class EA implements GameCompany{

    public List<Game> gameList = new ArrayList<>();

    public static EA ea;

    private EA() {
    }

    public static EA getInstance(){
        ea = new EA();
        return ea;
    }

    public  void addGameList(Game game){
        gameList.add(game);
    }

    public  Game getGameFromListWithName(String name){
        Game game=null;
        for (Game g :  gameList) {
            if(g.getName().equalsIgnoreCase(name)){
                game = g;
            }
        }

        if(game == null){
            try {
                throw new Exception("this game is not here");
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
        return game;
    }

    @Override
    public String getName() {
        return "EA";
    }

    @Override
    public List<Game> getList() {
        return this.gameList;
    }



}
