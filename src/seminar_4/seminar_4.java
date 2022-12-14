package seminar_4;
/*
Написать приложение для ввода ФИО, возраст и пол пользователей. Данные хранить в разных списках.
Сортировать пользователей по возрасту. Не вывести в порядке возрастания возрастов а именно сортировать!)/
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class seminar_4 {
    public static void main(String[] args) {

        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<String> list_sex = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner_age = new Scanner(System.in);
            Scanner sex = new Scanner(System.in);

            System.out.println("Enter your fio: ");
            String fio = scanner.nextLine();
            System.out.println("Enter your age: ");
            Integer age = scanner_age.nextInt();
            list_age.add(age);
            String[] fio1 = fio.split(" ");
            if (fio1.length == 3) {
                list_fname.add(fio1[1]);
                list_lname.add(fio1[0]);
                list_tname.add(fio1[2]);
            } else if (fio1.length == 2) {
                list_lname.add(fio1[0]);
                list_fname.add(fio1[1]);
                list_tname.add("");
            } else {
                list_lname.add(fio1[0]);
                list_fname.add("");
                list_tname.add("");
            }

            System.out.println("Enter your gender: ");
            String gender = sex.nextLine();
            if (gender.contains("M")) {
                list_sex.add("true");
            }
            else  {
                list_sex.add("false");
            }
            linkedlist.add(list_age.size() - 1);
            System.out.println("Do u want enter next one? Y/N");
            Scanner scanner1 = new Scanner(System.in);
            String yn = scanner1.nextLine();
            if(yn.toUpperCase().equals("N")) {
                flag = false;
            }
        }

        int cnt = list_age.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }
        linkedlist.forEach(i ->
                System.out.println(list_fname.get(i)+list_lname.get(i)+list_tname.get(i)+list_age.get(i)+list_sex.get(i)));

    }
}
