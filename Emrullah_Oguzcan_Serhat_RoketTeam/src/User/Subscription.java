package User;

import java.time.LocalDate;

public class Subscription {
    SubscriptionType subscriptionType = SubscriptionType.NONE;
    LocalDate endSubscription;


    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
        endSubscription = LocalDate.now().plusMonths(1);
    }

    public double getSubscriptionDiscount() {
        return subscriptionType.discountRate;
    }

    public static void main(String[] args) {

    }

}
