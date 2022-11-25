//Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i

import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(-1000, 1001);
        System.out.println(i);

    }
}
