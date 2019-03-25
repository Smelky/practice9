import com.development.mystack.MyStack;
import com.development.mystack.StackList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyStack {
    private StackList<String> myStack;

    @Before
    public void setUp() {
        myStack = new MyStack();
        myStack.push("One");
        myStack.push("Two");
    }

    @Test
    public void testSizeMethod() {
        myStack.push("Three");
        assertEquals(3, myStack.size());
    }

    @Test
    public void testPushMethod() {
        myStack.push("Three");
        assertEquals("Three", myStack.peek());
    }

    @Test
    public void testPeekMethod() {
        myStack.push("Three");
        assertEquals("Three", myStack.peek());
    }

    @Test
    public void testPopMethod() {
        assertEquals("Two", myStack.pop());
        assertEquals("One", myStack.peek());
    }

    @Test
    public void testRemoveMethod() {
        myStack.push("Three");
        myStack.remove(2);
        assertEquals("Two", myStack.peek());
    }

    @Test
    public void testClearMethod() {
        myStack.push("Three");
        myStack.clear();
        assertEquals(0, myStack.size());
    }
}
