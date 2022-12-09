//Удалить из первого списка все элементы отсутствующие во втором списке.

package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task_9 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(10));
        }
        System.out.println(array1);
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array2.add(new Random().nextInt(10));
        }
        System.out.println(array2);

        array1.removeAll(array2);
        System.out.println(array1);

    }
}
