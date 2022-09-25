package User;

public enum SubscriptionType {
    GOLD(50.0, 40.0), SILVER(25.0, 30.0), BRONZE(10.0, 20.0), NONE(0.0, 0.0);

    public double price;
    public double discountRate;

    SubscriptionType(double price, double discountRate) {
        this.price = price;
        this.discountRate = discountRate;
    }

    public double getPrice() {
        return price;
    }

}
