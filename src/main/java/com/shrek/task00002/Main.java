package com.shrek.task00002;



/**
 * Создать класс Runner implements Comparable, который будет содержать имя и время бегуна. Сделать то же самое что было в задаче task00001.
 * Только методы теперь будут принимать не 2 массива, а один массив из Runner. Написать тест,
 * подобный тесту из задачи task00001. Добавить в него проверки на время бегуна.
 */
public class Main {

    public String getWinner(Runner[] runners) {
        if (runners == null) {
            return null;
        }
        int winPosition = 0;
        for (int i = 0; i <= runners.length - 1; i++) {
            if (runners[i].compareTo(runners[winPosition]) < 0) {
                winPosition = i;
            }
        }
        return runners[winPosition].getName();
    }

    public String getSecond(Runner[] runners) {
        if (runners == null || runners.length < 2) {
            return null;
        }
        int secondPos = 1;
        int winnerPos = 0;
        if (runners[winnerPos].compareTo(runners[secondPos]) > 0) {
            secondPos = 0;
            winnerPos = 1;
        }
        for (int q = 2; q <= runners.length - 1; q++) {
            if (runners[q].compareTo(runners[secondPos]) < 0 && runners[q].compareTo(runners[winnerPos])> 0) {
                secondPos = q;
                continue;
            }
            if (runners[q].compareTo(runners[winnerPos]) <= 0) {
                secondPos = winnerPos;
                winnerPos = q;
            }
        }
        return (runners[secondPos].getName());

    }
}
