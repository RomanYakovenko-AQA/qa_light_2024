package org.variables_and_methods.class_work_3;

public class CleaningTimeForRoom_example {
    /**
     * Goals:
     * - Learn how to create a class
     * - Learn how to create a method
     * - Learn how to use a method
     * - Try different types of variables
     * - Try different types of operators
     * - Try concatenation of strings
     * - Try String.format("some text %s", variable)
     * - Try 'System.out.print'
     * - Try different types of comments
     * - Work on one class
     */
    /**
     * Advantages:
     * - Easy to use
     * - Easy to understand
     * Disadvantages:
     * - Not easy to support
     * - Not easy to extend
     * - Not easy to read
     */
    /**
     * Task1:
     * 1.1 Calculate time for cleaning one room 'Living room' 3.5x4
     * (2 pieces of furniture and 1 window)
     *
     * Assumptions:
     * for 1 square meter of room we need 1.5 minute to clean it by vacuum cleaner
     * for 1 square meter of room we need 3 minute to clean it by mop
     * for wipe the dust on one piece of furniture we need 1 minute
     * for clean the window we need 5 minutes
     */
    public static void main(String[] args) {
        // General variables
        float timeForVacuumCleanerDefault = 1.5f;
        byte timeForMopDefault = 3; // can be byte, short, int, long
        byte timeForWipeTheDustDefault = 1;
        int timeForWindowsDefault = 5;

        // Calculate time for cleaning one room 3.5x4 (2 pieces of furniture and 1 window)
        String nameOfRoom_1 = "Living room";

        int numberOfFurnitureRoom_1 = 2;
        int numberOfWindowsRoom_1 = 1;

        double widthOfRoom_1 = 3.5;
        double lengthOfRoom_1 = 4.25;

        String longNameOfRoom_1 = nameOfRoom_1 + " 3.5x"+lengthOfRoom_1+" (2 pieces of furniture and 1 window)";

        System.out.println(longNameOfRoom_1);

        String longNameOfRoom_1_with_5_params =
                String.format("%s %sx%s (%s pieces of furniture and %s window)"
                        , nameOfRoom_1, widthOfRoom_1, lengthOfRoom_1, numberOfFurnitureRoom_1, numberOfWindowsRoom_1);
        System.out.println(longNameOfRoom_1_with_5_params);

        // Calculate time for cleaning room 'Living room' and print result
//        System.out.println("--------- Starting calculations for Room 1 ---------");
        printTextLikeHeader("Starting calculations for Room 1");

        double areaOfRoom_1 = rounding(widthOfRoom_1 * lengthOfRoom_1);
        System.out.println("Area of room 1 is " + areaOfRoom_1 + " square meters");

        double timeForVacuumCleanerAndMop = rounding((timeForVacuumCleanerDefault + timeForMopDefault) * areaOfRoom_1);
        System.out.println("Time for vacuum cleaner and mop is " + timeForVacuumCleanerAndMop + " minutes");

        double timeForWipeTheDust = timeForWipeTheDustDefault * numberOfFurnitureRoom_1;
        System.out.println("Time for wipe the dust is " + timeForWipeTheDust + " minutes");

        double timeForWindows = timeForWindowsDefault * numberOfWindowsRoom_1;
        System.out.println("Time for windows is " + timeForWindows + " minutes");

        double totalTime = timeForVacuumCleanerAndMop + timeForWipeTheDust + timeForWindows;
        System.out.println("Total time for cleaning room 1 is " + totalTime + " minutes");

//        System.out.println("--------- Finish calculations for Room 1 ---------");
        printTextLikeHeader("Finish calculations for Room 1");

        // DRY - Don't Repeat Yourself




    }

    private static void printTextLikeHeader(String text) {
        String headerSymbol = "*".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + spaces + headerSymbol);
    }

    //    1.234 * 100 = 123.4 -> 123 / 100 = 1.23 -> 1 -> 1.0
//    1.234 * 100 = 123.4 -> 123 / 100.0 = 1.23  -> 1.23
    private static double rounding(double value) {
        double tempResult = Math.round(value * 100) / 100.0;
        return tempResult;
    }

}
