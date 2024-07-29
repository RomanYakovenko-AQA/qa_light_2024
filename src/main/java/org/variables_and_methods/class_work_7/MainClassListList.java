package org.variables_and_methods.class_work_7;

import java.util.ArrayList;

public class MainClassListList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ourListList = new ArrayList<>();
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.get(0).add("Element00");
        System.out.println(ourListList);
        ourListList.get(0).add("Element01");
        ourListList.add(new ArrayList<>());
        ourListList.add(new ArrayList<>());
//        ourListList.get(1).add("Element1");
        ourListList.get(2).add("Element2");
        System.out.println(ourListList);

        System.out.println("-----------");
        System.out.println(ourListList.get(0).get(1));
        System.out.println(ourListList.get(0));
        System.out.println("------------");

        ourListList.get(0).remove(0);
        ourListList.remove(1);
        System.out.println(ourListList);
        System.out.println("-----new list-----");

        ArrayList<String>new_list = new ArrayList<>();
        new_list.add("New list");
        new_list.add("New list2");
        new_list.add("New list3");
        ourListList.add(new ArrayList<>());
        ourListList.add(new ArrayList<>());
        ourListList.get(2).addAll(new_list);
        ourListList.add(new_list);
        new_list.add("test");

        System.out.println(ourListList);
        System.out.println(new_list);



    }
}
