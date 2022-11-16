package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<>();
        arrays.add("Zaur");
        arrays.add("Nick");
        arrays.add("Vova");
        arrays.add("Vasil");
        arrays.add("Kolya");
        arrays.add("Maria");
        arrays.add("Elena");

        //итератор вывел нам элементы с коллекции с помошью next
        Iterator<String> iterator = arrays.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");

        //вывод с помошью цикла for each
        for (String array : arrays) {
            System.out.println(array);
        }
        System.out.println("-------------------");
        System.out.println(arrays);

        //удаляем с помошью iterator
        Iterator<String> iterator1 = arrays.iterator();
        while (iterator1.hasNext()){//проверяем следующий элемент
            iterator1.next();//получаем элемент
            iterator1.remove();//удаляем элемент
        }

    }
}
