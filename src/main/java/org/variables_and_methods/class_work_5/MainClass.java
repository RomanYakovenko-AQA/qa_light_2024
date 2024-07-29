package org.variables_and_methods.class_work_5;

import org.variables_and_methods.class_work_4.RoomExtended;
import org.variables_and_methods.home_work_4.PrintToConsole;

public class MainClass {
    public static void main(String[] args) {
        PrintToConsole.printLikeHeader("Start work the program ");
        int[] massiveInt = {2,5,7,8,9,4};
        for (int i = 0; i < massiveInt.length; i++) {
            System.out.println(massiveInt[i]);
        }

        PrintToConsole.printLikeHeader("Start work with array");

        String[]arrayString = new String [20];

        for (int i = 0; i < arrayString.length; i++) {
            arrayString [i] = "Test_array_cell_"+(i+1);
            if ( i== arrayString.length-1){
                System.out.print(arrayString[i] + " ");
            }
            else{
                System.out.print(arrayString[i] + ", ");
            }
        }

        RoomExtended test = new RoomExtended(3,4);
        test.dividingCleaningWindowsByPerson(3);
    }
}
