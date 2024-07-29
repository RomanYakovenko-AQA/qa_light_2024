package org.variables_and_methods.currencyExchange.currency;

public class Som extends Currency implements IsCurrency{
    public Som(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "Som";
    }

    @Override
    public boolean isFreeConverted() {
        return false;
    }
}
