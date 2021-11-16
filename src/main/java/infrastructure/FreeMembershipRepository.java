package infrastructure;

import domain.Amount;
import domain.Payment;
import domain.PaymentMethod;
import domain.ServiceProvider;

public class FreeMembershipRepository implements PaymentMethod {
    public Payment payedBy(ServiceProvider serviceProvider, Amount amount) {
      return null;
    }

    public void save(Payment payment) {

    }
}
