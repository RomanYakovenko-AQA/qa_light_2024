package org.variables_and_methods.class_work_7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClassLists {
    public static void main(String[] args) {
        ArrayList<String>ourList = new ArrayList<>();
        System.out.println(ourList);
        ourList.add("Element_0");
        System.out.println(ourList);
        ourList.add("Element_1");
        ourList.add("Element_2");
        ourList.add("Element_3");
        System.out.println(ourList.get(1));
        ourList.add(1,"Element_4");
        System.out.println(ourList.get(1));
        ourList.set(1,"Element_44");
        System.out.println(ourList.get(1));
        System.out.println("-----");
        System.out.println(ourList.size());
        System.out.println(ourList.get(3));


        ArrayList<Integer>ourListInt = new ArrayList<>();
        ourListInt.add(1);
        ourListInt.add(3);
        ourListInt.add(4);
        ourListInt.add(2);
        ourListInt.add(5);

        System.out.println("--------");

        for (int i = 0; i < ourListInt.size(); i++) {
            System.out.println(ourListInt.get(i));

        }
        System.out.println("--------");
        for (int a : ourListInt)
              {
                  System.out.println(a);
        }

        System.out.println("--------");

        int a = 0;
        for (int line: ourListInt
             ) {
            if (line > a) {
                a=line;
            }
        }
        System.out.println(a);

    }


}
