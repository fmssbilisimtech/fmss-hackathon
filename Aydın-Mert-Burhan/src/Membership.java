public enum Membership {
    GOLD(0.4),SILVER(0.3),BRONZ(0.2),DEFAULT(0);
    double discount;
    Membership(double discount){
        this.discount=discount;
    }
}
