package org.variables_and_methods.home_work_4;

public class PrintToConsole {
    public static void printResult (String formulaRozrahunku, int resultRozrahunku){
        System.out.println("Результат виконання дії: " + formulaRozrahunku + " = "+ resultRozrahunku);  
    }

    public static void printResult (String formulaRozrahunku, double resultRozrahunku){
        System.out.println("Результат виконання дії: " + formulaRozrahunku + " = "+ resultRozrahunku);
    }

    public static void printResult (String formulaRozrahunku, String resultRozrahunku){
        System.out.println("Результат виконання дії: " + formulaRozrahunku + " = "+ resultRozrahunku);
    }
    public static void printLikeHeader(String text) {
        String headerSymbol = "*".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + headerSymbol);
    }


}
