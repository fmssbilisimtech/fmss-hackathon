public class Test {
    public static void main(String[] args) throws Exception {
        EA ea = EA.getInstance();
        Konami konami = Konami.getInstance();
        Ininal ininal = Ininal.getInstance();

        Fifa fifa = new Fifa("fifa", 300, 2, ea, PaidOrFree.PAID);
        FightNight fightNight = new FightNight("fightNight", 250, 5, konami, PaidOrFree.FREE);
        MetalGearSolid metalGearSolid = new MetalGearSolid("metal Gear Solid", 345, 13, konami, PaidOrFree.PAID);
        UFC ufc = new UFC("ufc", 423, 72, ea, PaidOrFree.PAID);


        User user1 = new User("ahmet", "yılmaz", 1, AbonePackage.GOLD);

        FmssCompany.sallerGames(user1, fifa, ininal, PaymentType.CREDITCARD);

        AccountManager.printInfo(user1, user1.getGame(), user1.getGame().getCompany(), CreatePaymentCompany.createPaymentCompany());
    }
}
