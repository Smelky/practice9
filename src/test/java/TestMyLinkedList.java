import com.development.lists.List;
import com.development.lists.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyLinkedList {
    private List<String> myLinkedList;

    @Before
    public void setUp() {
        myLinkedList = new MyLinkedList();
        myLinkedList.add("One");
        myLinkedList.add("Two");
    }

    @Test
    public void testSizeMethod() {
        myLinkedList.add("Three");
        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testGetMethod() {
        myLinkedList.add("Three");
        assertEquals("Three", myLinkedList.get(2));
    }

    @Test
    public void testRemoveMethod() {
        myLinkedList.add("Three");
        myLinkedList.remove(1);
        assertEquals("Three", myLinkedList.get(1));
    }

    @Test
    public void testAddMethod() {
        myLinkedList.add("Three");
        assertEquals("Three", myLinkedList.get(2));
    }

    @Test
    public void testClearMethod() {
        myLinkedList.add("Three");
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }
}
