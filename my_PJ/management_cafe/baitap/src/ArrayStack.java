import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack<T> implements StackADT<T> {
    private int top;
    private T[] stack;
    private final int DEFAULT_CAPACITY = 100;

    // Tao mot stack rong voi kich thuoc mac dinh
    public ArrayStack(){
        top = 0;
        stack = (T[])(new T[DEFAULT_CAPACITY]);
    }
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[])(new T[initialCapacity]);
    }
    private void expandCapacity() {
        // 1 2 3 4 5 6
        // Tao ra mang moi co kich thuoc gap doi
        T[] newStack = (T[])(new T[stack.length*2]);
        // _ _ _ _ _ _ _ _ _ _ _ _
        // Copy du lieu tu mang cu sang mang moi
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        // 1 2 3 4 5 6 _ _ _ _ _ _
        stack = newStack;
    }
    @Override
    public void push(T element) {
if(size()==stack.length){
    expandCapacity();
    stack[top]=element;
    top++;

}
    }

    @Override
    public T pop() {
        if(isEmpty())   {
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top]=null;
        return result;
    }

    @Override
    public T peek() {
        if(isEmpty())   {
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }
}
