package Arrays.Code;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        
  
    
    //ArrayList in java is a resizable array implementation of list interface,provided by java.util package.
    //Unlike regular arrays,an arraylist can shrink and grow dynamically as element are added or removed.

    ArrayList<Integer> arrlist=new ArrayList<>();

    //Note- This is special arraylist and refers to arraylist in contrast to list which is more generic and include 
    // linked list, etc .The arraylist methods are used by arraylis reference interface and list can only use method related to list.

    // non primitive type or wrapper function is used when we use arraylist as it is obj and wrapper function is obj class
    // int--integer

    // its size is dynamic the internal functionality is that whenever the size is full it grows by creating the
    // new arraylist of size double of the previous one and copying all the element there. 
       
    // this scenarios is not that usual i.e; the time complexity is "Amortized o(1)" where amortized refers to sometimes input can take longer time.

    // to add
    arrlist.add(1);
    arrlist.add(2);
    arrlist.add(31);
    arrlist.add(16);
    arrlist.add(15);


    // to replace

    arrlist.set(0,4);

    // to get

    arrlist.get(4);


    // to delete 

    System.out.println(arrlist);


    arrlist.remove(2);

    // we can directly print this

    System.out.println(arrlist);
    }
}
