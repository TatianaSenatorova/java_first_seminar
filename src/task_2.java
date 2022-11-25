//Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(0, 100);
        System.out.println(i);
        if (i == 0)
            System.out.println(0);;
        int bigger_byte = 0;
        i = i / 2;
        while(i != 0) {
            i /= 2;
            bigger_byte++;
            }
        System.out.println(bigger_byte);
    }
}
