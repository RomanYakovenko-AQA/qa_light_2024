package org.variables_and_methods.currencyExchange.currency;

public class Dollar extends Currency implements IsCurrency{
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
