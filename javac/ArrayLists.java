// import java.util.*;



import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int element = list.get(1);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}