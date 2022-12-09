//Вставить элемент в список в первой позиции.
package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array1.add(new Random().nextInt(10));
        }
        array1.add(0,12);
        System.out.println(array1);
        }
}
