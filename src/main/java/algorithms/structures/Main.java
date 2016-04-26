package algorithms.structures;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Bag<String> bag = new Bagof<String>();

        bag.addItem("a");
        bag.addItem("b");
        bag.addItem("c");
        bag.addItem("d");

        Iterator<String> iterator = bag.iterator();
        while (iterator.hasNext()){
            String val = iterator.next();
            System.out.println(val);
        }
    }
}
