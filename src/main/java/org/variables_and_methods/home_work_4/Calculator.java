package org.variables_and_methods.home_work_4;

public class Calculator {
    public int mnognyk = 2;

    public Calculator(int mnognyk) {
        this.mnognyk = mnognyk;
    }

    public Calculator() {
    }


    public int sum(int a, int b) {
        int result = (a + b) * this.mnognyk;
        PrintToConsole.printResult("(" + a + "+" + b + ")" + "*" + mnognyk, result);
        return result;
    }

    public String sum(String a, String b) {
        String result = (a + b).repeat(this.mnognyk);
        PrintToConsole.printResult("(" + a + "+" + b + ")" + " repeat " + mnognyk, result);
        return result;

    }

    public double subtraction(double a, double b) {
        double result = (a - b) * this.mnognyk;
        PrintToConsole.printResult("(" + a + "+" + b + ")" + " * " + mnognyk, result);
        return result;

    }

    public int multiplication(int a, int b) {
        int result = (a * b) * this.mnognyk;
        PrintToConsole.printResult("(" + a + "*" + b + ")" + " * " + mnognyk, result);
        return result;
    }

    public double division(double a, double b) {
        try {
            double result = (a / b) * this.mnognyk;

            PrintToConsole.printResult("(" + a + " / " + b + ")" + " * " + mnognyk, result);
            return result;

        }
        catch (Exception e) {
            System.out.println("(" + a + " / " + b + ")" + " * " + mnognyk + "There is exception :" + e);
        }
        return  -1;
    }
    public int division(int a, int b) {
        try {
            int result = (a / b) ;

            PrintToConsole.printResult("(" + a + " / " + b + ")" + "= ", result);
            return result;

        }
        catch (ArithmeticException e) {
            System.out.println("(" + a + " / " + b + ")" + "= "+"There is exception :" + e);
        }
        catch (Exception e){
            PrintToConsole.printResult("(" + a + " / " + b + ")" + "= "+e," ");

        }
        return  -1;
    }
}


