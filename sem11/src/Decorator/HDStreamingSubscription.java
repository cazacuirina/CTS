package Decorator;

public class HDStreamingSubscription extends SubscriptionDecorator{
    public HDStreamingSubscription(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription()+", vizionare in calitate HD";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice()+3.0;
    }
}
