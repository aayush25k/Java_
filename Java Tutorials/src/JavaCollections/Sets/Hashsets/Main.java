package JavaCollections.Sets.Hashsets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10); //duplicate value
        System.out.println(set);

        // the output will be :- [20, 40, 10, 30]
        // because the .add() method checks weather an element is already present or not in the set
        // if present it doesnot add the element, and if not present, it adds the element
        // internally the set dataStructure uses Map implementation.

    }
}
