//Реализовать множество (set) с помощью TreeMap. +
//Создать метод add, добавляющий элемент в ваше множество. +
//Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
// Объявить и инициализировать TreeSet использующий ваш компаратор.
//Добавить несколько эллементов в сет и вывести в консоль.

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Student {

    private String name;
    private int marks;

    public Student(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return this.name; }

    public Integer getMarks() { return this.marks; }
    // override toString method
    public String toString()
    {
        return this.name + ": " + marks;
    }
}

class AccordingMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return s2.getMarks().compareTo(s1.getMarks());
    }
}


public class  home_work_seminar_6{
    public static void main(String[] args)
    {

         TreeMap<Student, Integer> map
                = new TreeMap<>(new AccordingMarks());

        map.put(new Student("Иванов", 400), 1);
        map.put(new Student("Петров", 500), 2);
        map.put(new Student("Михайлов", 300), 3);

        System.out.println(
                "TreeMap Keys sorted in descending order of the marks: ");

        for (Map.Entry<Student, Integer> entry :
                map.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
    }
}

/*public class home_work_seminar_6 {
    public static <ClassA> void main(String[] args) {
        TreeMap<Integer, Integer> tree_1 = new TreeMap<>();
        TreeMap<Integer, Integer>[] tree_2 = new TreeMap[]{new TreeMap<>()};
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int randKey = r.nextInt(100);
            int randNum = r.nextInt(100);
            tree_1.put(randKey, randNum);

        }
            tree_1.forEach((k, v) -> System.out.println("TreeSet nums: " + k + "," + v));*/






