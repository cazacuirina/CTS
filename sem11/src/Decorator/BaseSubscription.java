package Decorator;

public class BaseSubscription implements Subscription{
    @Override
    public String getDescription() {
        return "Abonament baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
