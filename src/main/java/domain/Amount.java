package domain;

import java.util.Currency;

public class Amount {
    private double amount;
    private String currency;

    public Amount(double amount,String currency) {
        if(amount<0){
            throw new IllegalArgumentException("Amount need to be positive");
        }
        if(!currency.equals("")){
            throw new IllegalArgumentException("Need a currency");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }
    public String getCurrency() {
        return currency;
    }

}
