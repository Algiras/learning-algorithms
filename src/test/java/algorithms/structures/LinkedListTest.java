package algorithms.structures;

import edu.princeton.cs.algs4.In;
import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

    public void testUnShift(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.unShift(1)
            .unShift(2)
            .unShift(3);

        assertTrue(list.first().equals(1));
        assertTrue(list.last().equals(3));

    }

    public void testPush(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.push(1)
            .push(2)
            .push(3);

        assertTrue(list.first().equals(3));
        assertTrue(list.last().equals(1));

    }

    public void testLength(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.push(1)
            .push(2)
            .push(3);

        assertTrue(list.length().equals(3));
    }

    public void testShift(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.push(1)
            .push(2)
            .push(3)
            .shift();

        assertTrue(list.length().equals(2));
        assertTrue(list.first().equals(2));
    }

    public void testPop(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.push(1)
                .push(2)
                .push(3)
                .pop();

        assertTrue(list.length().equals(2));
        assertTrue(list.last().equals(2));
    }

    public void testBadPop(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        assertTrue(list.pop() == null);
    }

    public void testBadShift(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        assertTrue(list.shift() == null);
    }
}
