package com.shrek.task00003;
import javax.annotation.Nonnull;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс в конструкторе принимает список строк. Необхдимо реализовать 3 метода:
 * 1. Есть ли в списке дубликаты
 * 2. Сколько дублирующихся элементов
 * 3. Сколько каждый элемент раз встречается
 * <p>
 * Написать тесты
 */
public class Uniqueness {
    private final Map<String, Integer> mapOfElements;


    public Uniqueness(@Nonnull List<String> elements) {
        mapOfElements = elements.stream()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
    }

    public int duplicateCounter() {

        ArrayList<Integer> values = new ArrayList<>(mapOfElements.values());
        int count = 0;
        for (int i = 0; i < mapOfElements.size(); i++) {
            if (values.get(i) > 1) {
                count++;
            }
        }
        return count;
    }

    public boolean duplicateCheck() {
        ArrayList<Integer> values = new ArrayList<>(mapOfElements.values());

        for (int i = 0; i < mapOfElements.size(); i++) {
            if (values.get(i) > 1) {
                return true;
            }
        }
        return false;
    }

    public Map<String, Integer> numberOfEachDuplicate() {
        Map<String, Integer> duplicateNumbers = new HashMap<>();
        for (Map.Entry<String, Integer> item : mapOfElements.entrySet()) {
            if (item.getValue() > 1) {
                duplicateNumbers.put(item.getKey(), item.getValue());
            }
        }
        if (duplicateNumbers.size() == 0) {
            duplicateNumbers = null;
        }
        return duplicateNumbers;
    }
}
