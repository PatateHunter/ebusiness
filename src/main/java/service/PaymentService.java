package service;

import domain.Amount;
import domain.Payment;
import domain.PaymentMethod;
import domain.ServiceProvider;

public class PaymentService {
    private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Payment makePayment(ServiceProvider serviceProvider, Amount amount){
       return this.paymentMethod.payedBy(serviceProvider,amount);
    }
}
