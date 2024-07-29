package org.variables_and_methods.currencyExchange.menus;

import org.variables_and_methods.currencyExchange.currency.Currency;
import org.variables_and_methods.currencyExchange.currency.MapOfCurrency;

public  class CurrencyMenu extends Menu {
    public static void printCurrencyMenu () {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Som");
        System.out.println("100 : for Exit");
        System.out.println("Enter your choice:");

    }

    public static Currency getCurrency(int currencyNumber) {
        Currency tempCurrency;

        switch (currencyNumber){
            case 1 :
                System.out.println("dollar");
                tempCurrency = MapOfCurrency.getCurrencyHashMap().get("USD");
                break;
            case 2 :
                System.out.println("euro");
                tempCurrency = MapOfCurrency.getCurrencyHashMap().get("Euro");
                break;
            case 3 :
                System.out.println("som");
                tempCurrency = MapOfCurrency.getCurrencyHashMap().get("Som");
                break;
            default:
                System.out.println("default currency  - dollar");
                tempCurrency = MapOfCurrency.getCurrencyHashMap().get("USD");
        }
        return tempCurrency;
    }
}
