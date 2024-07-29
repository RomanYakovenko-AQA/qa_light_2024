package org.variables_and_methods.currencyExchange.currency;

public class Euro extends Currency  implements IsCurrency{
    public Euro(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
