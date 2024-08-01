//circular queue implementation using queue
class p2{
     static class queue{
       static int arr[];
       static int size;
       static int rear;
       static int front;//added since we need to 
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;//added
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;//changed
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("overflow");
                return ;
            }
            if(front==-1){//add first element
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            int top=arr[front];
           if(rear==front){//removig the last element
                rear=front=-1;
           }
           else{
           front=(front+1)%size;

           }
           return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String []args){
        queue q=new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
        }

    }
}