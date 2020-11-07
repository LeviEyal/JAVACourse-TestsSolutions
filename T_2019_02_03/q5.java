package src.T_2019_02_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class q5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 10; i > 0; i -= 2)
            arr.add(i);
        System.out.println(arr);

        for (int index = 0; index < arr.size(); index++)
            arr.set(index, arr.get(index) - 1);
        System.out.println(arr);

        ListIterator<Integer> iter = arr.listIterator();
        for (; iter.hasNext();) {
            Integer number = iter.next();
            number *= 2;
            iter.set(number);
        }
        System.out.println(arr);

        Iterator<Integer> iter2 = arr.iterator();
        for (; iter2.hasNext();) {
            Integer number = iter2.next();
            number--;
        }
        System.out.println(arr);
        
        arr.remove((Integer) 2);
        arr.remove((Integer) 2);
        System.out.println(arr);
    }
}
