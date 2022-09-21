public class User {
    private String name;
    private String surName;
    private int id;
    private Game game;
    private AbonePackage aPackage;
    private double balance=0;

    public User(String name, String surName, int id,  AbonePackage aPackage) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.aPackage = aPackage;
        FmssCompany.userList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public AbonePackage getaPackage() {
        return aPackage;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id=" + id +
                ", game name =" + game.getName() +
                ", package type =" + aPackage +
                ", balance=" + balance +
                '}';
    }
}
