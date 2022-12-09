
//Итерация всех элементов списка цветов и добавления к каждому символа '!'.
package home_work_3;

import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();

        array1.add("Красный");
        array1.add("Зеленый");
        array1.add("Голубой");
        array1.add("Желтый");
        array1.forEach((i) -> {
            System.out.println(i + '!');
        });
    }
}