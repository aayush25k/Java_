package JavaCollections.Lists.Arraylists;

import java.util.ArrayList;
import java.util.*;

public class RemoveIndex {
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        System.out.println("enter the size of the list");
        int size = in.nextInt();
        for(int i=0;i<size;i++){
            lst.add(i);
        }
        System.out.println(lst);
        System.out.println("enter the element you want to remove");
        int rem = in.nextInt();

            if(rem<=size-1){
                lst.remove(rem);
            }else{
                throw new NullPointerException("value not found");


            }


    }
}
