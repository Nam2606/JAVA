package Array_ListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> ageList = new ArrayList<Integer>();
    ageList.add(12);
    ageList.add(15);
    ageList.add(16);
    ageList.add(13);
    Collections.sort(ageList);
    Iterator<Integer> itr = ageList.iterator();
    while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
        ageList.remove(new Integer(12));
        System.out.println(ageList);
    }

}
