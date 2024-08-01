//apna college way
import java.util.*;
public class p1{
    //important to put static in the inner class You can create an 
    //instance of the Stack class directly without needing an instance of the outer class p1. 
    //This is because the Stack class is static.
    static class Stack
    {
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty()
        {
          return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
     }
     public static void main(String args[]){
            Stack s =new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
        System.out.println(s.pop());
        Stack s1 =new Stack();
         s1.push(1);
         System.out.println(s.pop());
         //diffrent objects share the same list in p2 sepration is there
     }
}