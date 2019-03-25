import com.development.lists.List;
import com.development.lists.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyArrayList {
    private List<String> myArrayList;

    @Before
    public void setUp() {
        myArrayList = new MyArrayList();
        myArrayList.add("One");
        myArrayList.add("Two");
    }

    @Test
    public void testSizeMethod() {
        myArrayList.add("Three");
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testGetMethod() {
        myArrayList.add("Three");
        assertEquals("Three", myArrayList.get(2));
    }

    @Test
    public void testRemoveMethod() {
        myArrayList.add("Three");
        myArrayList.remove(1);
        assertEquals("Three", myArrayList.get(1));
    }

    @Test
    public void testAddMethod() {
        myArrayList.add("Three");
        assertEquals("Three", myArrayList.get(2));
    }

    @Test
    public void testClearMethod() {
        myArrayList.add("Three");
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }
}
