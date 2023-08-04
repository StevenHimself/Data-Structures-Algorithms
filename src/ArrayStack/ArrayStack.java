package ArrayStack;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) { //constructor for caller to initialize the capacity of stack desired
        stack = new Employee[capacity]; //generates an array of size capacity
    }

    public void push(Employee employee) { //O(n) worst case
        if(top == stack.length) { //check to see if stack is full
            //need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length]; //double size of original array, if memory isn't an issue to improve performance
            System.arraycopy(stack, 0, newArray, 0, stack.length); //copies elements from original array to new array
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop() { //O(1)
        if (isEmpty()) { //if stack is empty
            throw new EmptyStackException(); //throw empty stack exception
        }
        Employee employee = stack[--top]; //else return employee before top and decrement top (top employee on the stack is stored in top - 1// )
        stack[top] = null;
        return employee;
    }

    public Employee peek() { //O(1)
        if (isEmpty()) { //if stack is empty
            throw new EmptyStackException(); //throw empty stack exception
        }
        return stack[top - 1]; //return the employee without changing top
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for(int i = top - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
