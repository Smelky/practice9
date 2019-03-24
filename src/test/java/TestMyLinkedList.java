import com.development.lists.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyLinkedList {

    @Test
    public void testSizeMethod() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add("Three");
        assert (myLinkedList.size() == 3);
    }

    @Test
    public void testGetMethod() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add("Three");
        assertEquals(2, myLinkedList.get(1));
    }

    @Test
    public void testRemoveMethod() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add("Three");
        myLinkedList.remove(1);
        assertEquals("Three", myLinkedList.get(1));
    }

    @Test
    public void testAddMethod() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        assertEquals(1, myLinkedList.get(0));
    }

    @Test
    public void testClearMethod() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add("Three");
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }
}
