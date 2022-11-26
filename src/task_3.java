//Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

import java.util.*;

public class task_3 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number n: ");
       int n = in.nextInt();
       System.out.print("Input a lower digit of the range i: ");
       List<Integer> list = new ArrayList<Integer>();
       for (int i= in.nextInt(); i < Short.MAX_VALUE; i++){
           if (i % n == 0){
               list.add(i);
           }
       }

       Integer [] m1 = list.toArray(new Integer[list.size()]);
       for (int i= 0; i < list.size(); i++) {
           System.out.println(m1[i]);
       }

    }
}
