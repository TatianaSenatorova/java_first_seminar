//*Сортировка списка.
package home_work_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_10 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(10));
        }
        System.out.println(array1);
        array1.sort(Comparator.naturalOrder());
        System.out.println(array1);

    }
}
