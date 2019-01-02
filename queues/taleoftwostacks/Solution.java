import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            T peek = stackOldestOnTop.pop();
            stackOldestOnTop.push(peek);
            while (!stackOldestOnTop.isEmpty()) {
                stackNewestOnTop.push(stackOldestOnTop.pop());
            }
            return peek;

        }

        public T dequeue() {
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            T pop = stackOldestOnTop.pop();
            while (!stackOldestOnTop.isEmpty()) {
                stackNewestOnTop.push(stackOldestOnTop.pop());
            }
            return pop;
        }
    }
}