import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number n: ");
        int n = in.nextInt();
        System.out.print("Input a higher digit of the range i: ");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = in.nextInt(); i >= Short.MIN_VALUE; i--) {
            if (i % n != 0) {
                list.add(i);
            }
        }
        Integer[] m2 = list.toArray(new Integer[list.size()]);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(m2[i]);
        }
    }
}
