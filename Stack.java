public class Stack {
    int size;

    int top;

    int[] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            array[top + 1] = item;
            top--;
        }
    }

    int pop(int item) {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            top --;
        }
        return array[previousTop];
    }

    void printItems() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Elements in the stack are taken");
            printElementsInRecursive(0);
            System.out.println();
        }
    }

    void printElementsInRecursive(int index) {
        if (index > top) {
            return;
        }
        System.out.println(array[index] + " ");
        printElementsInRecursive(index + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(45);
        stack.push(5);
        stack.push(15);
        stack.push(35);
        stack.push(5);
        stack.pop(9);

        stack.printItems();
    }
}
