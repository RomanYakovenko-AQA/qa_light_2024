package org.variables_and_methods.currencyExchange;

import org.variables_and_methods.currencyExchange.currency.*;
import org.variables_and_methods.currencyExchange.menus.ActionsMenu;
import org.variables_and_methods.currencyExchange.menus.CurrencyMenu;

public class CurrencyExchange {
    public static void main(String[] args) {
        final int EXIT_NUMBER = 100;
        Currency workingCurrency;

        Dollar dollar = new Dollar(40);
        Som som = new Som(0.001);
        Euro euro = new Euro(44);
        BitCoin bitCoin = new BitCoin(20000);

        MapOfCurrency.addCurency(dollar);
        MapOfCurrency.addCurency(som);
        MapOfCurrency.addCurency(euro);
        MapOfCurrency.addCurency(bitCoin);

        MapOfCurrency.getCurrencyHashMap( );


        int currencyNumber;
        do {
            CurrencyMenu.printCurrencyMenu();
            currencyNumber = CurrencyMenu.getNumberFromConsole();
//            System.out.println("Currency = " + currencyNumber);
            if (currencyNumber==0){
                System.out.println("Wrong currency!!! Try again");
            }
            else if (currencyNumber!= EXIT_NUMBER){
//                System.out.println("Currency = " + currencyNumber);
                workingCurrency=CurrencyMenu.getCurrency(currencyNumber);
//                System.out.println("Currency name = " + workingCurrency.getCurrencyName() + " kurs " +
//                        workingCurrency.getKursNBU());
                boolean  stayInAction;
                do{
                    ActionsMenu.printActionsMenu(workingCurrency);
                    int submenuNumber = ActionsMenu.getNumberFromConsole();
                    stayInAction = (submenuNumber != EXIT_NUMBER);
                    if (stayInAction){
                    System.out.println("Submenu number = " +submenuNumber );}
                    ActionsMenu.doActionWithCurrency (workingCurrency, submenuNumber);

                }

                while (stayInAction);

            }

        }
        while (currencyNumber!=EXIT_NUMBER);
        System.out.println("----Gooodbye----");

    }
}
