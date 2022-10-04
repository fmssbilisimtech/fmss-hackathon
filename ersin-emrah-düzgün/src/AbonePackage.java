public enum AbonePackage {
    GOLD(40),SILVER(30),BRONZE(20);

    int discount;

    AbonePackage(int discount) {
        this.discount = discount;
    }
}
