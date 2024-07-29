package org.variables_and_methods.class_work_3;

public class CalculatingTimeForRoom {
    /*
    Calculating time for room 'Cold room' 2.5*3.5
    (2 Windows)
     */
    public static void main(String[] args) {
        // General variables
        float timeForVacuumCleaner = 1.5f;
        byte timeForMop = 3, timeForWindow = 5;

        String nameOfRoom_2 = "Cold_room";
        double width = 2.5, length = 3.5;
        int numberOfWindows = 2;

        //Calculation

        String longRoomName_2 = nameOfRoom_2 + " " + width + "x" + length + ". Number of windows is " + numberOfWindows;
        System.out.println(longRoomName_2);

        String longRoomName_2_1 = String.format("%s %sx%s. Number of windows is %s  ", nameOfRoom_2,width,length,
                numberOfWindows);
        System.out.println(longRoomName_2_1);

        double timeForVacuumCleanerAndMop = (timeForVacuumCleaner+ timeForMop) * width * length;
        System.out.println(timeForVacuumCleanerAndMop);

        double timeForCleaniingAllWindows = timeForWindow * numberOfWindows;
        System.out.println("Time For Cleaniing Al lWindows = " + timeForCleaniingAllWindows);

        double totalTime = timeForVacuumCleanerAndMop + timeForCleaniingAllWindows;
    //    System.out.println( "----- Total time " + totalTime + " -----");
        printLikeHeader("Total time is " + totalTime);
        printLikeHeader("The end ");


    }

    private static void printLikeHeader(String text){
        String headerSymbol = "*".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + headerSymbol);
    }

}
