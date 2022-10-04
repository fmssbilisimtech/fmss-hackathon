
public class Fifa implements Game{

   private PaidOrFree paidOrFree;
   private String name;
   private double price;
   private int id;
   private GameCompany gameCompany;

    public Fifa(String name, double price ,int id, GameCompany gameCompany,PaidOrFree paidOrFree) {
        this.paidOrFree = paidOrFree;
        this.name = name;
        this.id = id;
        this.gameCompany = gameCompany;
        EA.getInstance().addGameList(this);
        setPrice(price);



    }

    public void setPrice(double price) {

        if(getPaidOrFree().i == 1){
            this.price = price;
        }else{
            this.price = 0;
        }
    }

    @Override
    public PaidOrFree getPaidOrFree() {
        return this.paidOrFree;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public GameCompany getCompany() {
        return this.gameCompany;
    }


}
