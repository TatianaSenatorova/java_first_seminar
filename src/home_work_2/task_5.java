//Замените символ “=” на слово “равно”.
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().


package home_work_2;

public class task_5 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello = привет = გამარჯობა");
        System.out.println(str);
        while (str.toString().contains("=")) {
            int index = str.indexOf("=");
            str.insert(index, "равно");
            int index_1 = str.indexOf("=");
            str.deleteCharAt(index_1);

        }
        System.out.println(str);
    }
}