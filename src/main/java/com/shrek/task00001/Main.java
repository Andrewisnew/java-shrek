package com.shrek.task00001;


/**
 * Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон представленны в массиве.
 * Необходимо найти человека, который быстрее всех пробежал дистанцию и вывести его имя.
 * Найти человека, который прибежал вторым.
 */
public class Main {
    public String getWinner(String[] runners, int[] times) {

        String winnerName;
        if (times.length == 0) {
            return null;
        }
        int min1 = times[0];

        for (int i = 0; i <= times.length - 1; i++) {
            if (times[i] < min1) {
                min1 = times[i];
            }
        }
        int winnerPos = 0;
        for (int pos = 0; pos <= times.length - 1; pos++) {
            if (times[pos] == min1) {
                winnerPos = pos;
            }
        }
        winnerName = runners[winnerPos];
        return winnerName;
    }

    public String getSecond(String[] runners, int[] times) {
        if (times.length < 2) {
            return null;
        }
        int min1 = times[0];
        int min2 = times[1];
        int min3 = times[times.length - 1];
        int min4 = times[times.length - 2];

        int secondTime;
        int secondPos = 0;
        String secondName;
        for (int i = 0; i <= times.length - 1; i++) {
            if (min1 > times[i]) {
                min2 = min1;
                min1 = times[i];
            }
        }
        for (int p = times.length - 1; p >= 0; p--) {
            if (min3 > times[p]) {
                min4 = min3;
                min3 = times[p];
            }
        }

        if (min2 < min4) {
            secondTime = min2;
        } else
            secondTime = min4;

        for (int pos = 0; pos < times.length; pos++) {
            if (times[pos] == secondTime) {
                secondPos = pos;
            }
        }

        secondName = runners[secondPos];

        return secondName;
    }
}
