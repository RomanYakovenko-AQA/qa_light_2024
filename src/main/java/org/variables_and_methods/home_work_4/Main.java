package org.variables_and_methods.home_work_4;

public class Main {
    public static void main(String[] args) {
        Calculator calculatorMnognyk2  = new Calculator();
        Calculator calculatorMnognyk5 = new Calculator(5);
        Calculator calculatorMnognyk1 = new Calculator(1);

         int result_1= calculatorMnognyk2.sum(3,5);

         double result_2 = calculatorMnognyk2.subtraction(20,5);

        double result_3 = calculatorMnognyk2.division(30,0);

        int result_4 = calculatorMnognyk5.sum(3,5);

        double result_5 = calculatorMnognyk5.subtraction(20,5);

        double result_6 = calculatorMnognyk5.division(30,3);

        String result_string_7 =  calculatorMnognyk5.sum("_Test","_row");

        int result_8 = calculatorMnognyk1.sum(3,5);

        String result_string_9 = calculatorMnognyk1.sum("_Test","_Row");

        System.out.println("----");
        double result_10 = (calculatorMnognyk2.sum(3,5) + calculatorMnognyk5.subtraction(8,5)) * 2 ;
        PrintToConsole.printResult("result_10 ", result_10);

        System.out.println("Результат виконання дій: " + (result_1 + result_2 + result_3 + result_4 + result_5 +
                result_6  + result_8  + result_10));

        calculatorMnognyk1.division(3,0);



    }
}
