package duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Oksana on 19.03.2017.
 */
public class dublic2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Set <Integer>  set;
        list.add(21);
        list.add(10);
        list.add(24);
        list.add(2);
        list.add(21);
       set = new HashSet<>();
        System.out.println(set.size());
    }
}
