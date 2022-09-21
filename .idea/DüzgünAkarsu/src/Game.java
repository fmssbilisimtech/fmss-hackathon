public interface Game {
    PaidOrFree getPaidOrFree();
    String getName();
    double getPrice();
    int getId();
    GameCompany getCompany();
}
