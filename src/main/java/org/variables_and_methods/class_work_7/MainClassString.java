package org.variables_and_methods.class_work_7;

public class MainClassString {
    public static void main(String[] args) {
        String testString = "Test string.\\\". ";
        String testString2 = new String("Test string.\\\". ");

//        testString = testString.trim();
        System.out.println("'"+testString+"'");
        System.out.println("'"+testString.trim()+"'");
        System.out.println("'"+testString+"'");

        if (testString==testString2){ // == -> works with link to object
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }
        System.out.println("Test".equals("test"));
        System.out.println("Test".equalsIgnoreCase("test"));
        System.out.println("Test".toLowerCase());
        System.out.println("Test".toUpperCase());

        String [] varString = "Test test1 test2".split(" ");
        System.out.println(varString[1]);
        System.out.println(varString.length);
        System.out.println("TestTest".replace("s","S"));


    }
}
