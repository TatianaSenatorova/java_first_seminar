package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class task_4 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array1.add(new Random().nextInt(10));
        }

        System.out.println(array1);
        array1.remove(0);
        System.out.println(array1);
    }
}
