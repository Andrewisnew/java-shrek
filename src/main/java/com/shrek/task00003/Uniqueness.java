package com.shrek.task00003;

import javax.annotation.Nonnull;
import java.util.*;

/**
 * Класс в конструкторе принимает список строк. Необхдимо реализовать 3 метода:
 * 1. Есть ли в списке дубликаты
 * 2. Сколько дублирующихся элементов
 * 3. Сколько каждый элемент раз встречается
 * <p>
 * Написать тесты
 */
public class Uniqueness {
    public List<String> elements;

    public Uniqueness(@Nonnull List<String> elements) {
        this.elements = elements;
    }

    public int dublicateCounter() {
        if (elements.size() < 2) {
            return 0;
        }
        int allDublicateCounter = 0;
        Set<String> set = new HashSet<String>();
        for (String element : elements) {
            if (!set.add(element)) {
                allDublicateCounter++;
            }
        }
        return allDublicateCounter;
    }

    public boolean duplicateCheck() {
        if (elements.size() < 2) {
            return false;
        }
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (elements.get(i).equals(elements.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Map<String, Integer> numberOfEachDuplicate() {
        Map<String, Integer> duplicateNumbers = new HashMap<String, Integer>();
        if (elements.size() < 2) {
            duplicateNumbers.put(elements.get(0), 0);
            return duplicateNumbers;
        }
        for (int i = 0; i < elements.size(); i++) {
            int count = 0;
            for (int j = 0; j < elements.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (elements.get(i).equals(elements.get(j))) {
                    count++;
                }
            }
            duplicateNumbers.put(elements.get(i), count);
        }
        return duplicateNumbers;
    }
}
