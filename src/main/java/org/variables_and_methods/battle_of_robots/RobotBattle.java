package org.variables_and_methods.battle_of_robots;

import java.util.Scanner;



public class RobotBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування імені для першого робота
        System.out.print("Введіть ім'я першого робота: ");
        String firstRobotName = scanner.nextLine();
        Robot firstRobot = new Robot(firstRobotName);

        // Зчитування імені для другого робота
        System.out.print("Введіть ім'я другого робота: ");
        String secondRobotName = scanner.nextLine();
        Robot secondRobot = new Robot(secondRobotName);

        // Виведення кнопок урону для підтвердження
        System.out.println("Кнопки урону для першого робота: " + firstRobot.getDamageButtons());
        System.out.println("Кнопки урону для другого робота: " + secondRobot.getDamageButtons());

        boolean isGameRunning = true;
        Robot currentRobot = firstRobot;
        Robot otherRobot = secondRobot;


        while (isGameRunning) {
            System.out.println();
            System.out.println("Стріляє робот: " + currentRobot.getName());
            System.out.println("Натисніть будь яку букву зі списку (WEASDZXC)");
            System.out.println("Для виходу натисніть Р");
            try {
                char input = scanner.nextLine().toUpperCase().charAt(0);


                if (input == 'P') {
                    isGameRunning = false;
                    System.out.println("Гру завершено.");
                    break;
                }


                if (currentRobot.getButtonList(input)) {
                    System.out.println("true");

                    if (currentRobot.isDamageButton(input)) {
                        currentRobot.removeDamageButton(input);
                        otherRobot.takeDamage();
                        System.out.println("Хороший постріл! БабаХ! " + otherRobot.getName() + " втрачає 20% здоров'я.");
                        // Зміна гравця
                        Robot temp = currentRobot;
                        currentRobot = otherRobot;
                        otherRobot = temp;
                    } else {

                        System.out.println("Кнопка не активна.");
                        // Зміна гравця
                        Robot temp = currentRobot;
                        currentRobot = otherRobot;
                        otherRobot = temp;
                    }
                } else System.out.println("Кнопки не має в списку. Натисніть будь яку букву зі списку (WEASDZXC)  ");


                // Виведення здоров'я роботів після кожного ходу
                System.out.println(firstRobot.getName() + " - Здоров'я: " + firstRobot.getHealth());
                System.out.println(secondRobot.getName() + " - Здоров'я: " + secondRobot.getHealth());

                // Перевірка, чи хтось із роботів виграв
                if (!otherRobot.isAlive()) {
                    System.out.println(currentRobot.getName() + " переміг!");
                    isGameRunning = false;
                }
            }
            catch (Exception e){
                System.out.println("Букву не обрано. Натисніть будь яку букву зі списку (WEASDZXC) ");
            }


            // Зміна гравця
//            Robot temp = currentRobot;
//            currentRobot = otherRobot;
//            otherRobot = temp;
        }

        scanner.close();
    }
}
