package serializationAndDesearilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

/**
 * класс который записывает в файл "people.bin" обьекты
 */
public class WriteObject {
    public static void main(String[] args) {
    Person person1 = new Person(1,"Nick");
    Person person2 = new Person(3,"Bob");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //запись обьектов
            oos.writeObject(person1);
            oos.writeObject(person2);

            //закрытие потока
            oos.close();
        } catch (IOException e) {
            System.out.println("Обработали эксепшн");
            e.printStackTrace();
        }
    }
}
