//*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

package home_work_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class task_11 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(10));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            array1.add(0, new Random().nextInt(10));
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(array1);

        LinkedList <Integer> array2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array2.add(new Random().nextInt(10));
        }
        long start_2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            array2.add(0, new Random().nextInt(10));
        }
        System.out.println(System.currentTimeMillis() - start_2);
        System.out.println(array2);

    }
}

