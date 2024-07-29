package org.variables_and_methods.class_work_4;


import static org.variables_and_methods.class_work_4.GeneralTimeConstants.*;

public class Room {
    private String nameOfRoom;
    private String longNameOfRoom;

    private double width, length;

    protected int numberOfWindows;
    private int numberOfFurniture;

    private double areaOfRoom;


    public double getAreaOfRoom() {
        return areaOfRoom;

    }

    public String getNameOfRoom() {
        return nameOfRoom;
    }

    //public Room () {}


    public Room(double width, double length) {
        nameOfRoom = "DefaultRoom";
        this.width = width;
        this.length = length;
        numberOfFurniture = 0;
        numberOfWindows = 1;
        areaOfRoom = this.width * this.length;
    }

    public Room(String nameOfRoom, double width, double length, int numberOfWindows, int numberOfFurniture) {
        this.nameOfRoom = nameOfRoom;
        this.width = width;
        this.length = length;
        this.numberOfWindows = numberOfWindows;
        this.numberOfFurniture = numberOfFurniture;
        areaOfRoom = this.width * this.length;
    }

    public void printArea() {
        System.out.println("Area of " + nameOfRoom + " => " + areaOfRoom);
    }


    public double calculatingTimeForVacuumCleanerAndMop() {
        double tempTime = this.areaOfRoom * (TIME_FOR_VACUUM_CLEANER + TIME_FOR_MOP);
        System.out.println("Time for vacuum cleaner and mop for " + nameOfRoom + " is " + tempTime);
        return tempTime;
    }

    public double calculationTimeForWipeDust() {
        return this.numberOfWindows * TIME_FOR_WIPE_THE_DUST;
    }

    public double calculatingTimeForCleanWindows() {
        double timeForCleanWindows = this.numberOfWindows * TIME_FOR_CLEANER_WINDOW;
        return timeForCleanWindows;
    }

    public double totalTimeForCleaning() {
        Double totalTime = calculatingTimeForVacuumCleanerAndMop() + calculationTimeForWipeDust() + calculatingTimeForCleanWindows();
        // System.out.println("---- Total time " + totalTime + " ----");
        PrintToConsole.printTotalString (totalTime.toString());
        return totalTime;
    }


}
