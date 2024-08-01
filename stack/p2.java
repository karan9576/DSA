import java.util.*;
public class p2 {
    static class Stack {
        //here arrylist is made private so that any one out
        private ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);

        Stack s2 = new Stack();
        s2.push(3);
        s2.push(4);

        System.out.println("Stack s1:");
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

        System.out.println("Stack s2:");
        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
        //here the list is seprated simnce static is not used
    }
}
