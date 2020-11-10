package com.shrek.task00001;


/**
 * Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон представленны в массиве.
 * Необходимо найти человека, который быстрее всех пробежал дистанцию и вывести его имя.
 * Найти человека, который прибежал вторым.
 */
public class Main {
    public String getWinner(String[] runners, int[] times) {
        int[] shrek = new int[times.length];
        System.arraycopy(times, 0, shrek, 0, times.length);
        //int winnerTime;
        boolean sort = true;
        String winnerName;
        if (times.length == 0) {
            return null;
        }
        while (sort) {
            sort = false;
            for (int i = 1; i <= shrek.length - 1; i++) {
                if (shrek[i] < shrek[i - 1]) {
                    int change = shrek[i];
                    shrek[i] = shrek[i - 1];
                    shrek[i - 1] = change;
                    sort = true;
                }

            }
        }
        int winnerPos = 0;


        for (int pos = 0; pos <= times.length - 1; pos++) {
            if (times[pos] == shrek[0]) {
                winnerPos = pos;
            }

        }

        winnerName = runners[winnerPos];

        return winnerName;
    }

    public String getSecond(String[] runners, int[] times) {
        int[] kersh = new int[times.length];
        System.arraycopy(times, 0, kersh, 0, times.length);
        int secondTime;
        int secondPos = 0;
        String secondName;
        boolean sort = true;
        if (times.length < 2) {
            return null;
        }
        while (sort) {
            sort = false;
            for (int i = 0; i < kersh.length - 1; i++) {
                if (kersh[i] < kersh[i + 1]) {
                    int change = kersh[i];
                    kersh[i] = kersh[i + 1];
                    kersh[i + 1] = change;
                    sort = true;
                }

            }
        }


        secondTime = kersh[times.length - 2];
        for (int pos = 0; pos < times.length; pos++) {
            if (times[pos] == secondTime) {
                secondPos = pos;
            }
        }

        secondName = runners[secondPos];

        return secondName;
    }
}
