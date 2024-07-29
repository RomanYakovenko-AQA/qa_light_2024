package org.variables_and_methods.home_work_3;

public class CalculatingTimeForGarageAndKitchen {
    /*
    Calculating time for Garage 3.5x6 (1 gate (1.8 x 3.3) and 1 window)
     */

    public static void main(String[] args) {
        //General variables
        double timeToCleanByVacuumCleaner = 1.5; //  for 1 square meter of room we need 1.5 minute to clean it by vacuum cleaner
        double timeToCleanByMop = 3.0; //for 1 square meter of room we need 3 minute to clean it by mop
        double timeToCleanByKarcher = 0.5; //  for 1 square meter of gate we need 0.5 minute to wash it by Karcher
        double timeToWipeTheDust = 1; // for wipe the dust on one piece of furniture we need 1 minute
        double timeToCleanTheWindow = 5.0; //  for clean the window we need 5 minutes
        String nameOfRoom_1 = "Garage";
        String nameOfRoom_2 = "Kitchen";



        //Variables for Garage
        String nameGarageGate = " Garage Gate";
        double garageWidth = 3.5;
        double garageLength = 6;
        double garageGateWith = 3.3;
        double garageGateHigh = 1.8;

        double garageGateSquare = rounding(garageGateHigh * garageGateWith);
        double areaOfGarage = calculateAreaOfRoom(3.5, 6);
        double timeGarageFloorCleaningByKarcher = areaOfGarage * timeToCleanByKarcher;
        double timeGarageGateCleaningByKarcher = (garageGateSquare * timeToCleanByKarcher)*2;
        String longNameForGarageGate = String.format(("%s with area %s  square meters we need %s minutes "),nameGarageGate,
                garageGateSquare,timeGarageGateCleaningByKarcher);
        printLikeHeader(" Start calculation ");
        printLikeHeader(longNameForGarageGate);
        printLikeHeader(" The End ");
        double totalCleaningTimeForGarage = timeGarageFloorCleaningByKarcher + timeGarageFloorCleaningByKarcher;


        // Variables for Kitchen
        double kitchenWidth = 2.5;
        double kitchenLength = 3.5;
        int numberOfWindows = 2;
        int numberOfFurniture = 14;
        int numberOfDishes = 8;
        double areaOfKitchen = calculateAreaOfRoom(3.5, 6);

        // Calculation
        double timeForVacuumCleaner = calculateAreaOfRoom(garageWidth,garageLength) * timeToCleanByVacuumCleaner;




    }

    public static double calculateAreaOfRoom(double width, double height) {
        return width * height;
    }

    public static void printLikeHeader(String text) {
        String headerSymbol = "*".repeat(10);
        String spaces = " ".repeat(2);
        System.out.println(headerSymbol + spaces + text + headerSymbol);
    }

    public static double rounding (double value){
        double tempResult = Math.round(value * 100) / 100.0;
        return tempResult;
    }

}
