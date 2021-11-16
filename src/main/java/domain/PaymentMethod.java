package domain;

public interface PaymentMethod {
    public Payment payedBy(ServiceProvider serviceProvider,Amount amount);
    public void save(Payment payment);
}
