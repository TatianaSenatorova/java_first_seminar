//Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.

package home_work_lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class task_3 {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "green");
        map.put(3, "yellow");
        Set<Integer> keySet = map.keySet();
        for (int i: keySet) {
            map.compute(i, (k, v) -> v = v + "!");
        }
        map.forEach((k, v)->System.out.println("HashMap key: " + k + " val: " + v));

        Map<Integer, String> tree_map = new TreeMap<>();
        tree_map.put(1, "red");
        tree_map.put (2, "green");
        tree_map.put (3, "yellow");
        Set<Integer> keySet_tree = tree_map.keySet();
        for (int i: keySet_tree) {
            tree_map.compute(i, (k, v) -> v = v + "!");
        }
        tree_map.forEach((k, v)->System.out.println("TreeMap key: " + k + " val: " + v));

    }
}
