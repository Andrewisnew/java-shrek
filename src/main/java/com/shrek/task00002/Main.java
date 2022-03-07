package com.shrek.task00002;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * Создать класс Runner implements Comparable, который будет содержать имя и время бегуна. Сделать то же самое что было в задаче task00001.
 * Только методы теперь будут принимать не 2 массива, а один массив из Runner. Написать тест,
 * подобный тесту из задачи task00001. Добавить в него проверки на время бегуна.
 */
public class Main {

    public String getWinner(Runner[] runners) {
        if (runners.length == 0) {
            return null;
        }
        Arrays.sort(runners);

        return runners[0].getName();
    }

    public String getSecond(Runner[] runners) {
        if (runners.length == 0 || runners.length < 2) {
            return null;
        }
        Arrays.sort(runners);
        return (runners[1].getName());

    }
}
