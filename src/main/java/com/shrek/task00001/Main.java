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
        int winnerTime = times[0];
        int winnerPos = 0;
        for (int i = 0; i <= times.length - 1; i++) {
            if (times[i] <= winnerTime) {
                winnerTime = times[i];
                winnerPos = i;
            }
        }
        return runners[winnerPos];
    }

    public String getSecond(String[] runners, int[] times) {
        if (times.length < 2) {
            return null;
        }
        int secondTime = times[1];
        int secondPos = 1;
        int winnerPos = 0;
        String secondName;
        if (times[0] > times[1]) {
            secondTime = times[0];
            secondPos = 0;
            winnerPos = 1;
        }
        for (int i = 2; i <= times.length - 1; i++) {
            if (times[i] < secondTime && times[i] > times[winnerPos]) {
                secondTime = times[i];
                secondPos = i;
                continue;
            }
            if (times[i] <= times[winnerPos]) {
                secondTime = times[winnerPos];
                secondPos = winnerPos;
                winnerPos = i;
                continue;
            }
        }
        secondName = runners[secondPos];
        return secondName;
    }
}
 