//Поиска элемента в списке по строке.
package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task_7 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(10));
        }
        System.out.println(array1);

        for (int i = 0; i < 10; i++) {
            if (array1.get(i) == 3) {
                System.out.println(i);
            }
        }
    }
}

