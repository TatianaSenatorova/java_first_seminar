//Создать словарь HashMap. Обобщение <Integer, String>.
package home_work_lesson_5;

import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args){
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.forEach((k, v)->System.out.println("key: " + k + " val: " + v));
    }
}
