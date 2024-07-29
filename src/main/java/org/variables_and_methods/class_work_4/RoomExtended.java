package org.variables_and_methods.class_work_4;



public class RoomExtended extends Room {

    public RoomExtended(double width, double length) {
        super(width, length);
    }

    public RoomExtended(String nameOfRoom, double width, double length, int numberOfWindows, int numberOfFurniture) {
        super(nameOfRoom, width, length, numberOfWindows, numberOfFurniture);
    }

    public int dividingCleaningWindowsByPerson(Integer numberOfRerson) {
        System.out.println("Number of person is " + numberOfRerson);
        try {
            int numberOfWindows = this.numberOfWindows / numberOfRerson;
            System.out.println(getNameOfRoom() + "Number of window for person is " + numberOfWindows);
            return numberOfWindows;
        } catch (ArithmeticException e) {
            System.out.println("Error: number of person is " + numberOfRerson);
            return numberOfRerson; // number of windows by person
        }catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        } finally {
            System.out.println("----------Block Finally---------");
        }
    }


}
