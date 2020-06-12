package leetcodechallenge;

import java.util.*;

public class InsertDeleteGetRandom {
    List<Integer>list=null;

    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        list=new LinkedList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        Integer str=Integer.valueOf(val);
        if(list.contains(str))
            return false;
        boolean t=list.add(val);
        return t;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        Integer str=Integer.valueOf(val);
        boolean t=list.remove(str);
        return t;

    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rand= new Random();
        int number=rand.nextInt(list.size());
        return list.get(number);
    }
    public static void main(String[] args) {

    }
}
