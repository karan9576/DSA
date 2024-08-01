public class p3{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    static class queue{
        static node front=null;
        static node rear=null;
        public static boolean isEmpty(){
            return front==null && tail==null;
        }
        public static void add(int data){
            node newNode=new node(data);
            if(isEmpty()){
               rear=front=newNode;
                return;
            }
            rear.next=newNode;
            rear=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int res=front.data;
            if(front==rear){//single element present in linked list
                rear=null;
            }
            front=front.next;
            return res;
        }
        public static int peek(){
            return front.data;
        }

    }
    public static void main(String []args){
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
         System.out.println(q.remove());
          System.out.println(q.remove());
        
          System.out.println(q.remove());
        
          System.out.println(q.remove());

    }
}