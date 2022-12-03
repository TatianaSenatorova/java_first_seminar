//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

package home_work_2;

public class task_6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello = привет = გამარჯობა");
        System.out.println(str);
        while (str.toString().contains("=")) {
            int index = str.indexOf("=");
            str.replace(index, index + 1, "равно");

        }
        System.out.println(str);
    }
}
