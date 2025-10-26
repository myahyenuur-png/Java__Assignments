public class Stack {
    private String[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new String[capacity];
        top = -1;
    }

    public void push(String element) {
        if (isFull()) {
            expand();
        }
        stack[++top] = element;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        String element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    private void expand() {
        int newCapacity = capacity * 2;
        String[] newStack = new String[newCapacity];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
        capacity = newCapacity;
        System.out.println("Stack expanded to capacity: " + capacity);
    }
}

