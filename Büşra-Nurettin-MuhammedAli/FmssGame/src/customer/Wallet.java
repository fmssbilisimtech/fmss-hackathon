package customer;

public class Wallet {
    private final int customerID;
    private int total;

    public Wallet(int customerID){
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
