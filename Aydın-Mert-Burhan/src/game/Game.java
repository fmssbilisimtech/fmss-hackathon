package game;

public class Game {
    public long id;
    public String gameName;
    public double price;
    public String company;

    public Game(long id, String gameName, double price, String company) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
        this.company = company;
    }

}
