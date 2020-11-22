package com.shrek.task00001;


/**
 * Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон представленны в массиве.
 * Необходимо найти человека, который быстрее всех пробежал дистанцию и вывести его имя.
 * Найти  человека, который прибежал вторым.
 */
public class Main {
    public String getWinner(String[] runners, int[] times) {

        if (times.length == 0) {
            return null;
        }
        int min1 = times[0];
        int winnerPos = 0;
        for (int i = 0; i <= times.length - 1; i++) {
            if (times[i] < min1) {
                min1 = times[i];
            }
            if (times[i] == min1) {
                winnerPos = i;
            }
        }
        return runners[winnerPos];
    }

    public String getSecond(String[] runners, int[] times) {
        if (times.length < 2) {
            return null;
        }
        int winnerTime = times[0];
        int secondTime = times[1];

        int secondPos = 0;
        String secondName;

        if (times.length == 2) {
            if (times[0] > times[1]) {
                winnerTime = times[1];
                secondTime = times[0];
            }
        }

        for (int i = 2; i <= times.length - 1; i++) {
            if (winnerTime > times[i] && secondTime > times[i]) {
                winnerTime = times[i];
            }
            if (winnerTime < times[i] && secondTime > times[i]) {
                secondTime = times[i];
            }
        }

        for (int pos = 0; pos < times.length; pos++) {
            if (times[pos] == secondTime) {
                secondPos = pos;
            }
        }

        secondName = runners[secondPos];
        return secondName;
    }
}
 