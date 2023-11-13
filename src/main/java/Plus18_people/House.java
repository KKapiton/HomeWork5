package Plus18_people;

import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> residents = new HashMap<>();
        residents.put("John Doe", 25);
        residents.put("Jane Doe", 20);
        residents.put("Peter Parker", 30);
        residents.put("Mary Jane", 17);
        for(Entry<String , Integer> entry: residents.entrySet()) {
            Integer value = entry.getValue();
            if (entry.getValue() >= 18) {
                List<String> list = new ArrayList<String>(residents.keySet());
                /*Set<String> set = new HashSet<>(list);        //
                list.clear();                                 // Пытался отсортить аррейлист этим способом
                list.addAll(set); */                            //
                list.sort(Comparator.naturalOrder());     // И этим способом тоже
                System.out.println(list);
            }
        }
    }
}