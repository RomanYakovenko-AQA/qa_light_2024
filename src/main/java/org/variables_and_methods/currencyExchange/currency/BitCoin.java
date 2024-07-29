package org.variables_and_methods.currencyExchange.currency;

public class BitCoin extends Currency{
    public BitCoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String getCurrencyName() {
        return "BitCoin";
    }
}
