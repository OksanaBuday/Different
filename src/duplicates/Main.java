package duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Oksana on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();


        list.add(1);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(32);
        list.add(32);
        Set<Integer>set = new HashSet<>(list);
//        for (Integer integer :list){
//            set.add(integer);
//        }
            System.out.println(set.size());
    }
}
