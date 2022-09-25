package game;

public class GameController {



    private static void start(){
        System.out.println("\tOyun oyunanıyor.");
    }
    private static void play(){

    }
    private static void pause(){

    }
    private static void end(){
        System.out.println("\tOyun bitti");
    }

    public static final void run(Game game)
    {
        System.out.println(game.title);
        start();
        play();
        pause();
        end();
    }
}
