import com.development.lists.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyLinkedList {
    private MyLinkedList myLinkedList;

    @Before
    public void setUp() {
        myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
    }

    @Test
    public void testSizeMethod() {
        myLinkedList.add(3);
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testGetMethod() {
        myLinkedList.add(3);
        assertEquals(3, myLinkedList.get(2));
    }

    @Test
    public void testRemoveMethod() {
        myLinkedList.add(3);
        myLinkedList.remove(1);
        assertEquals(3, myLinkedList.get(1));
    }

    @Test
    public void testAddMethod() {
        myLinkedList.add(3);
        assertEquals(3, myLinkedList.get(2));
    }

    @Test
    public void testClearMethod() {
        myLinkedList.add(3);
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }
}
