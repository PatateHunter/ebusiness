package domain;

public class Payment {
    private Amount amount;
    private ServiceProvider serviceProvider;

    public Payment(Amount amount, ServiceProvider serviceProvider) {
        this.amount = amount;
        this.serviceProvider = serviceProvider;
    }

    public Amount getAmount() {
        return amount;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }
}
