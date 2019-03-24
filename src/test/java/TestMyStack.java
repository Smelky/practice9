import com.development.mystack.MyStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyStack {
    private MyStack myStack;

    @Before
    public void setUp() {
        myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
    }

    @Test
    public void testSizeMethod() {
        myStack.push(3);
        assertEquals(3, myStack.size());
    }

    @Test
    public void testPushMethod() {
        myStack.push(3);
        assertEquals(3, myStack.peek());
    }

    @Test
    public void testPeekMethod() {
        myStack.push(3);
        assertEquals(3, myStack.peek());
    }

    @Test
    public void testPopMethod() {
        assertEquals(2, myStack.pop());
        assertEquals(1, myStack.peek());
    }

    @Test
    public void testRemoveMethod() {
        myStack.push(3);
        myStack.remove(2);
        assertEquals(2, myStack.peek());
    }

    @Test
    public void testClearMethod() {
        myStack.push(3);
        myStack.clear();
        assertEquals(0, myStack.size());
    }
}
