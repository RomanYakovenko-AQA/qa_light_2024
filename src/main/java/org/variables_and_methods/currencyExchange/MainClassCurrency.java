package org.variables_and_methods.currencyExchange;

import org.variables_and_methods.currencyExchange.currency.BitCoin;
import org.variables_and_methods.currencyExchange.currency.Dollar;
import org.variables_and_methods.currencyExchange.currency.Euro;
import org.variables_and_methods.currencyExchange.currency.Som;

public class MainClassCurrency {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(40);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(40.5);
        System.out.println(dollar.getKursNBU());;

        System.out.println(dollar.getMarga());

        dollar.exchangeGrnToCurrency(4100);
        dollar.exchangeCurrencytoGRN(1000);

        Euro euro = new Euro(44);
        euro.exchangeGrnToCurrency(4500);
        dollar.exchangeGrnToCurrency(4500);

        System.out.println(dollar.isFreeConverted());

        Som som = new Som(0.0001);
        som.exchangeGrnToCurrency(10);
        System.out.println(som.isFreeConverted());

        BitCoin bitCoin = new BitCoin(20000);
        bitCoin.exchangeGrnToCurrency(20000);


    }
}
