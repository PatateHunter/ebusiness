package infrastructure;

import domain.Amount;
import domain.Payment;
import domain.PaymentMethod;
import domain.ServiceProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterCardPayementRepository implements PaymentMethod {
    private final List<Payment> paymentTrace = new ArrayList<Payment>();

    public Payment payedBy(ServiceProvider serviceProvider, Amount amount) {
        System.out.println("Pays " + amount.getAmount());
        Payment payment = new Payment(amount,serviceProvider);
        save(payment);
        return payment;
    }

    public void save(Payment payment) {
        paymentTrace.add(payment);
    }
}
