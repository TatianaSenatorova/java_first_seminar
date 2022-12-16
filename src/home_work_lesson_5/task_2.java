//Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)

package home_work_lesson_5;

import java.util.HashMap;
import java.util.Map;

public class task_2 {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "green");
        map.put(3, "yellow");
        map.putIfAbsent(4, "blue");

        map.forEach((k, v)->System.out.println("key: " + k + " val: " + v));

    }
}
