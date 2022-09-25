import customer.Customer;
import fmss_game.FmssGame;
import games.Game;
import packages.Bronze;
import packages.Gold;
import packages.Silver;
import payment.Payment;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Customer customer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer = new Customer();

        System.out.println("FmssGame'e Hoşgeldiniz!\n");
        System.out.println("Abonelik Türünüzü Seçiniz:\n1-Gold\n2-Silver\n3-Bronz\n");
        int packageType = Integer.parseInt(sc.nextLine());

        switch (packageType) {
            case 1 -> customer.setPaket(new Gold());
            case 2 -> customer.setPaket(new Silver());
            case 3 -> customer.setPaket(new Bronze());
        }

        mainMenu();
    }


    public static void listAllGames() {
        for (Game game : FmssGame.INSTANCE.getGames()) {
            System.out.printf("%d - %s - %d TL%n", game.getId(), game.getName(), game.getPrice());
        }

        selectGame(FmssGame.INSTANCE.getGames());
    }

    public static void selectGame(List<Game> list) {
        Scanner sc = new Scanner(System.in);
        int select = Integer.parseInt(sc.nextLine());

        System.out.printf("%s sepete eklensin mi?%n", list.get(select - 1).getName());
        System.out.print("1-Evet\n2-Hayır\n");

        int yesNo = Integer.parseInt(sc.nextLine());

        if (yesNo == 1) {
            System.out.println("Sepete Eklendi");
            customer.getCart().getList().add(list.get(select - 1));
            System.out.println("1-Ana Menüye Dön\n2-Sepete Git\n");

            select = Integer.parseInt(sc.nextLine());
            if (select == 1) {
                mainMenu();
            } else {
                showCart();
            }
        } else {
            mainMenu();
        }
    }

    private static void showCart() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Sepet toplamı: %d%n", customer.getCart().calculateOrder(customer.getPaket()));

        System.out.printf("Ödemeyi onaylamak istiyor musunuz?%n");
        System.out.print("1-Evet\n2-Hayır\n");

        int yesNo = Integer.parseInt(sc.nextLine());

        if (yesNo == 1) {
            System.out.println("Ödeme Yönteminizi Seçiniz:");
            System.out.println("1- Kredi Kartı");
            System.out.println("2- Telefon");
            System.out.println("3- Hediye Kartı");
            System.out.println("0- ÇIKIŞ");

            int select = Integer.parseInt(sc.nextLine());

            if (select != 0) {
                Payment.pay(select, customer);
                System.out.println("Ödeme Tamamlandı");
                customer.getGames().addAll(customer.getCart().getList());
                customer.getCart().getList().removeAll(customer.getCart().getList());
            }
        }
        mainMenu();
    }

    private static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ana Menü");
        System.out.println("1- TÜM OYUNLAR");
        System.out.println("2- SEPETİM");
        System.out.println("3- KİTAPLIĞIM");
        System.out.println("0- ÇIKIŞ");

        int select = Integer.parseInt(sc.nextLine());

        switch (select) {
            case 1 -> listAllGames();
            case 2 -> showCart();
            case 3 -> showLibrary();
        }
    }

    private static void showLibrary() {
        for (Game game : customer.getGames()) {
            System.out.println(game.getName());
        }

        mainMenu();
    }
}
