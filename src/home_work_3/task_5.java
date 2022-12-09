//Обновить определенный элемент списка по заданному индексу.
package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task_5 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array1.add(new Random().nextInt(100));
        }

        System.out.println(array1);
        array1.set(1, new Random().nextInt(100));
        System.out.println(array1);
    }
}