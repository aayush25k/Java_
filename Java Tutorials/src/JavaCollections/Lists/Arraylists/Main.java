package JavaCollections.Lists.Arraylists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty()); // to check is list is empty or not; returns boolean val;
        list.add(20); // index 0
        list.add(60); // index 1
        list.add(40); // index 2
        list.add(20); // index 3           //duplicate value

        System.out.println(list);
        // order is preserved in list;

        System.out.println(list.isEmpty());

        System.out.println(list.get(2));  // pick list value using index;
        System.out.println("hee hee");

        // how to traverse in a list
        for(int data:list){
            System.out.println(data);
        }
        System.out.println(list.size());

    }
}
