package Lab10;

import java.util.Stack;

public class Lab12 {
    public static void main(String[] args){
        StackDemo s = new StackDemo();
        System.out.println(s.reverseStringUsingStack("Last Lab???"));

        CustomQueue b = new CustomQueue();
        b.enqueue(12);
        b.enqueue(24);
        b.enqueue(36);
        b.dequeue();
        b.isEmpty();
        b.size();

        s.printQueueInReverse(b);

    }

    static class StackDemo{
        public static String reverseStringUsingStack(String input){
            Stack<String> s = new Stack<>();
            for (int i = 0; i < input.length(); i++){
                s.push(input.substring(i, i + 1));
            }
            int setSize = s.size();
            String newString = "";

            for (int j = 0; j < setSize; j++){
                String next = s.pop();
                // newString.concat(next) didn't work. Don't know why.
                newString = newString + next;
            }
            return newString;
        }

        public void printQueueInReverse(CustomQueue queue){
            Stack<Integer> s = new Stack<>();
            int initialQueueSize = queue.size();
            for (int i = 0; i < initialQueueSize; i++){
                s.push(queue.dequeue());
            }
            int reverseQueueSize = s.size();
            for (int i = 0; i < reverseQueueSize; i++){
                int currentIteration = s.pop();
                System.out.println(currentIteration);
                queue.enqueue(currentIteration);
            }
        }
    }

    public static class CustomQueue{
            private Stack<Integer> customStack = new Stack<>();

            public void enqueue(int value){
                this.customStack.push(value);
            }

            public int dequeue(){
            if (customStack.isEmpty()){
                System.out.println("Is Empty");
                return 0;
            }
            else
                return customStack.pop();
        }

        public boolean isEmpty(){
            if (customStack.isEmpty()){
                System.out.println("Is Empty");
                return true;
            }
            else
                System.out.println("Is not Empty");
                return false;
            // that was convenient. stopped an error in previous function
            // and is reused for another.
        }

        public int size(){
            if (customStack.isEmpty()){
                System.out.println("0");
                return 0;
            }
            else
                return this.customStack.size();
        }
    }

}
