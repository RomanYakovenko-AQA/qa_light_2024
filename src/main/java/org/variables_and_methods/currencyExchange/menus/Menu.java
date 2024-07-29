package org.variables_and_methods.currencyExchange.menus;

import java.util.Scanner;

public class Menu {
    public static int getNumberFromConsole (){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (Exception e){
            return 0;
        }
    }
    public static double getDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Not a doble. So return -1. ");
            return -1;
        }
    }
}
