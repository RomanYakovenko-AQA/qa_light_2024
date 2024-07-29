package org.variables_and_methods.battle_of_robots;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robot {
    private String name;
    private int health;
    private List<Character> damageButtons;
    public static final char[] BUTTONS = {'Q', 'W', 'E', 'A', 'S', 'D', 'Z', 'X', 'C'};
    private static final int DAMAGE_PERCENTAGE = 20;
    private String alphabet = "QWEASDZXC";


    // Конструктор, що приймає ім'я робота
    public Robot(String name) {
        this.name = name;
        this.health = 100; // Здоров'я за замовчанням
        this.damageButtons = new ArrayList<>();

        // Ініціалізація damageButtons п'ятьма випадковими кнопками
//        for (int i = 0; i < 5; i++) {
//            damageButtons.add(getRandomButton());
//        }
        for (int i = 0; i < 5; i++) {
            damageButtons.add(getRandomKey());
        }
    }

    // Метод для отримання імені робота
    public String getName() {
        return name;
    }

    // Метод для отримання здоров'я робота
    public int getHealth() {
        return health;
    }

    // Метод для зменшення здоров'я робота
    public void takeDamage() {
        this.health -= DAMAGE_PERCENTAGE;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // Метод для випадкового вибору кнопки з BUTTONS
    private char getRandomButton() {
        Random random = new Random();
        return BUTTONS[random.nextInt(BUTTONS.length)];
    }

    // Метод для перевірки чи кнопка є активною
    public boolean isDamageButton(char button) {
        return damageButtons.contains(button);
    }

    // Метод для видалення кнопки після використання
    public void removeDamageButton(char button) {
        damageButtons.remove((Character) button);
    }

    // Метод для отримання кнопок, які знімають 20% життя
    public List<Character> getDamageButtons() {
        return damageButtons;
    }

    // Метод для перевірки чи робот ще живий
    public boolean isAlive() {
        return health > 0;
    }

    public boolean getButtonList (char button) {

        for (char element : BUTTONS){
            if (element == button) {
                return true;
            }
    }
    return false;
    }


    char getRandomKey(){
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }
}

