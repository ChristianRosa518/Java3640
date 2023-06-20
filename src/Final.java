import java.util.ArrayList;
import java.util.Stack;

public class Final {
    public static void main(String[] args){
        IntArrayQueue n = new IntArrayQueue();
        n.enqueue(9);
        System.out.println(n.dequeue());

        System.out.println(isPalindrome("eye_"));
        System.out.println(isPalindrome("eye"));

        infix("h+h/12334+-323**");

        MinStack s = new MinStack();
        s.push(9);
        s.push(120);
        s.push(16090);
        s.push(130);

        System.out.println(s.getMin());
        System.out.println(s.pop());
        System.out.println(s.getMin());

        Stack<Integer> d = new Stack<>();
        d.push(12);
        d.push(212);
        d.push(3210);
        d.push(1298);
        d.push(123124);


        printStackInReverse(d);

        System.out.println(checkBalanced("(()))"));
        System.out.println(checkBalanced("(())"));
    }

    public static boolean checkBalanced(String input){
        Stack<String> s = new Stack<>();
        for (int i = 0; i < input.length(); i++){
            String currentLetter = input.substring(i, i + 1);
            if (currentLetter.equals("(") || currentLetter.equals("[")
                    || currentLetter.equals("{")) {
                s.push(currentLetter);
            }
            if(s.isEmpty()) return false;

            String check = "";
            switch (currentLetter) {
                case ")":
                    check = s.pop();
                    if (check.equals("{") || check.equals("["))
                        return false;
                    break;

                case "}":
                    check = s.pop();
                    if (check.equals("(")|| check.equals("["))
                        return false;
                    break;

                case "]":
                    check = s.pop();
                    if (check.equals("(")|| check.equals("{"))
                        return false;
                    break;
            }
        }

        return s.isEmpty();
    }
    public static void printStackInReverse(Stack<Integer> initialStack){
        Stack<Integer> s = new Stack<>();
        int initialStackSize = initialStack.size();
        for (int i = 0; i < initialStackSize; i++){
            int currentNum = initialStack.pop();
            s.push(currentNum);
        }
        int reverseQueueSize = s.size();
        for (int i = 0; i < reverseQueueSize; i++){
            int currentIteration = s.pop();
            System.out.println(currentIteration);
            initialStack.push(currentIteration);
        }
        // lovely little lab 12 question.
    }

    public static class IntArrayQueue{
        private ArrayList<Integer> customArray = new ArrayList<>();

        public void enqueue(int value) {this.customArray.add(value);}

        public int dequeue(){
            return this.customArray.remove(this.customArray.size() - 1);
        }
    }

    public static boolean isPalindrome(String n){
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--){
            reverse = reverse + n.substring(i, i + 1);
            System.out.println(reverse);
        }
        if (n.equals(reverse)){
            return true;
        }
        else return false;
    }

    public static void infix(String n){
        Stack<String> expressions = new Stack<>();
        String letters = "";
        for (int i = 0; i < n.length(); i++){
            String currentLetter = n.substring(i ,i + 1);
            if (currentLetter.equals("/") || currentLetter.equals("+")
                    || currentLetter.equals("-") || currentLetter.equals("*")){
                expressions.push(currentLetter);
            }else letters = letters + currentLetter;

        }
        int initialSize = expressions.size();
        for (int i = 0; i < initialSize; i++) {
        letters = letters + expressions.pop();
        }
        System.out.println(letters);
    }

    public static class MinStack{
        private Stack<Number> customStack = new Stack<>();

        public void push(int n){
            customStack.push(n);
        }
        public int pop(){
            int value = customStack.pop().intValue();
            return value;
        }
        public int getMin(){
            return customStack.size();
        }
    }


}
