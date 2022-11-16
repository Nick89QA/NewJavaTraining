package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IntArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 11;
        array[1] = 12;
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("1");
        collection.add("2");
        collection.add("1");
        collection.add("1");
        collection.remove(2);

    }
}