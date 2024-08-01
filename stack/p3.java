public class p3{
    static public class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;//dont miss this 
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty())
            return -1;
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String str[]){
            Stack s=new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);
            while(!s.isEmpty()){
            System.out.println(s.pop());
            }
    }
}