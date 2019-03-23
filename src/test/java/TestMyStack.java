import com.development.mystack.MyStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyStack {

    @Test
    public void testSizeMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        myStack.push("Second");
        myStack.push("Third");
        myStack.push(4);
        assertEquals(4, myStack.size());
    }

    @Test
    public void testPushMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        assertEquals(0, myStack.peek());
    }

    @Test
    public void testPeekMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        assertEquals(0, myStack.peek());
    }

    @Test
    public void testPopMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        myStack.push(1);
        assertEquals(1, myStack.pop());
        assertEquals(0, myStack.peek());
    }

    @Test
    public void testRemoveMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.remove(2);
        assertEquals(1, myStack.peek());
    }

    @Test
    public void testClearMethod() {
        MyStack myStack = new MyStack();
        myStack.push(0);
        myStack.push(1);
        myStack.clear();
        assertEquals(0, myStack.size());
    }
}
