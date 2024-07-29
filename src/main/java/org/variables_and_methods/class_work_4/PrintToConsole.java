package org.variables_and_methods.class_work_4;

public class PrintToConsole {
    /**
     * Print text with "-"
     * @param text
     */
    public  static  void  printLikeHeader (String text) {
        String symbol = "-";
        System.out.println(symbol.repeat(5) + " " + text + " " + symbol.repeat(10));
    }

    /**
     * totalValue -> ----- TOTAL VALUE = [totalValue] ----------
     * @param totalValue
     */
    public  static void printTotalString (String totalValue) {
        printLikeHeader("TOTAL VALUE = " + totalValue);

    }

}
