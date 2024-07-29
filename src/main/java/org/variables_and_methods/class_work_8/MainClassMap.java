package org.variables_and_methods.class_work_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Test1",1);
        map.put("Test2",2);
        map.put("Test3",3);
        map.put("Test4",4);
        map.put("Test5",5);
        System.out.println(map.size());
        System.out.println(map.get("Test1"));


        ArrayList <HashMap<String,String>> listMap = new ArrayList<>();
        listMap.add(new HashMap<>());
        listMap.get(0).put("login","test");
        listMap.get(0).put("pass", "123");
        listMap.get(0).put("pass1", "1232232");

        listMap.add(new HashMap<>());
        listMap.get(1).put("login", "test");
        listMap.get(1).put("pass", "234234");
        listMap.get(1).put("pass1", "23rwer34");

        listMap.add(new HashMap<>());
        listMap.get(2).put("login", "test1");
        listMap.get(2).put("pass", "test2");
        listMap.get(2).put("pass2", "test3");


        System.out.println(listMap);
        System.out.println(listMap.get(1));
        System.out.println(listMap.get(2).get("pass"));






    }
}
