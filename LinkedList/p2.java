//apna college way
public class p2{
   public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
        

    }
    public static node head;
    public static node tail;


    public void addFirst(int data){
        node newNode =new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[]){
            p2 ll=new p2();
            ll.addFirst(10);
            ll.addFirst(20);
            System.out.println(ll.head.data);
    }
}