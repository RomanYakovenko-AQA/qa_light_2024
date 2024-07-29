package org.variables_and_methods.currencyExchange.currency;

import java.util.HashMap;

public class MapOfCurrency {
    private static HashMap <String, Currency> currencyHashMap = new HashMap<>();

    public static void addCurency (Currency currency){
        currencyHashMap.put(currency.getCurrencyName(),currency);
    }

    public static HashMap <String, Currency> getCurrencyHashMap(){
        return currencyHashMap;
    }
}
