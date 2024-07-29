package org.variables_and_methods.currencyExchange.menus;

import org.variables_and_methods.currencyExchange.currency.Currency;

public class ActionsMenu extends Menu {
    public static void printActionsMenu(Currency workingCurrency) {
        System.out.println();
        System.out.println("Choose action for " + workingCurrency.getCurrencyName() + " : ");
        System.out.println("1 : Change Currency to GRN ");
        System.out.println("2 : Change GRN to Currency ");
        System.out.println("3 : Change kurs NBU");
        System.out.println("4 : Show kurs NBU");
        System.out.println("100: Exit from menu");
        System.out.println("Your choice : ");
    }

    public static void doActionWithCurrency(Currency workingCurrency, int submenuNumber) {
        switch (submenuNumber) {
            case 1:
                System.out.println("Enter number of currency: " + workingCurrency.getCurrencyName());
                int numberOfCurrency = getNumberFromConsole();
                workingCurrency.exchangeCurrencytoGRN(numberOfCurrency);
                break;
            case 2:
                System.out.println("Enter number of GRN: ");
                workingCurrency.exchangeGrnToCurrency(getNumberFromConsole());
                break;
            case 3:
                System.out.println("Enter new kurs NBU for currency: " + workingCurrency.getCurrencyName() + " :");
                double newKursNBU = getDoubleFromConsole();
                if (newKursNBU > 0) {
                    workingCurrency.setKursNBU(newKursNBU);
                }
                else {
                    System.out.println("Kurs can not be less 0");
                }

                break;
            case 4:
                System.out.println(String.format("Kurs NBU %s is %s",
                        workingCurrency.getCurrencyName(), workingCurrency.getKursNBU()));
                break;
            default:
                System.out.println("No action with number " + submenuNumber);

        }
    }
}
