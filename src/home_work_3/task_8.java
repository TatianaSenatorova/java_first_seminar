//Создать новый список и добавить в него несколько елементов первого списка.

package home_work_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_8 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(new Random().nextInt(10));
        }
        System.out.println(array1);

        List l1 = array1.subList(3, array1.size()-2);

        System.out.println(l1);

    }
}

