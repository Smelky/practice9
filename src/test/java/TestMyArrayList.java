import com.development.lists.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyArrayList {

    @Test
    public void testSizeMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add("Three");
        assert (myArrayList.size() == 3);
    }

    @Test
    public void testGetMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add("Three");
        assertEquals(2, myArrayList.get(1));
    }

    @Test
    public void testRemoveMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add("Three");
        myArrayList.remove(1);
        assertEquals("Three", myArrayList.get(1));
    }

    @Test
    public void testAddMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        assertEquals(1, myArrayList.get(0));
    }

    @Test
    public void testClearMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add("Three");
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }
}
