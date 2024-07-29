package org.variables_and_methods.class_work_4;



public class CalculationCleaningTimeForRoom {
    public static void main(String[] args) {

        Room livingRoom = new Room("Living Room", 3.4, 4.6, 2, 1);

//        System.out.println("Area = " + livingRoom.getAreaOfRoom());

        livingRoom.printArea();


        Room defaultRoomObject = new Room(2, 3);

//        System.out.println("Area of " + defaultRoomObject.getNameOfRoom() + " = " + defaultRoomObject.getAreaOfRoom());


        defaultRoomObject.printArea();

        double timeLivingRoom = livingRoom.totalTimeForCleaning();
        double timeDefaultRoom = defaultRoomObject.totalTimeForCleaning();

        PrintToConsole.printTotalString( (timeDefaultRoom + timeLivingRoom) + " min ");

        PrintToConsole.printLikeHeader("The and");

    }
}
