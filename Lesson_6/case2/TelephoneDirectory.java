package Lesson_6.case2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    private final Map<String, List<String>> directory;

    public TelephoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(number);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }
}