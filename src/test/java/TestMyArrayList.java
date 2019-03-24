import com.development.lists.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyArrayList {
    private MyArrayList myArrayList;

    @Before
    public void setUp() {
        myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
    }

    @Test
    public void testSizeMethod() {
        myArrayList.add(3);
        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testGetMethod() {
        myArrayList.add(3);
        assertEquals(2, myArrayList.get(1));
    }

    @Test
    public void testRemoveMethod() {
        myArrayList.add(3);
        myArrayList.remove(1);
        assertEquals(3, myArrayList.get(1));
    }

    @Test
    public void testAddMethod() {
        myArrayList.add(1);
        assertEquals(1, myArrayList.get(0));
    }

    @Test
    public void testClearMethod() {
        myArrayList.add(3);
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }
}
