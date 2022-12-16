//*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
package home_work_lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task_4 {
    public static void main(String[] args){
        Random rk = new Random();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int randKey = rk.nextInt(10000000);
            map.put (randKey, "str");
        }
        map.forEach((k, v)->System.out.println("HashMap key: " + k + " val: " + v));

    }
}
