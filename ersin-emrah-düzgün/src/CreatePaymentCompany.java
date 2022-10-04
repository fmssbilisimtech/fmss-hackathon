public class CreatePaymentCompany {

    // factory method

    public static PaymentCompany createPaymentCompany() {

        int random = (int) (Math.random() * 5) + 1;

        PaymentCompany paymentCompany = null;
        switch (random) {
            case 1 -> paymentCompany = Ininal.getInstance();
            case 2 -> paymentCompany = Ipara.getInstance();
            case 3 -> paymentCompany = Iyzico.getInstance();
            case 4 -> paymentCompany = Papara.getInstance();
            case 5 -> paymentCompany = Troy.getInstance();
        }
        return paymentCompany;
    }
}
