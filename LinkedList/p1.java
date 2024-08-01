import java.util.*;
class node{
    int data;
    node next;
}

class p1{
    private static Scanner sc = new Scanner(System.in);
   static node start=null;
    public static void main(String []args){
        
        while(true)
    {
        System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Display the linked list");
            System.out.println("2. Create the linked list");
            System.out.println("3. Exit");
            System.out.println("4. Insert at beginning");
            System.out.println("5. Insert at end");
            System.out.println("6. Insert at any position");
            System.out.println("7. Delete from beginning");
            System.out.println("8. Delete from end");
            System.out.println("9. Delete from any position");
            System.out.println("10. Reverse the linked list");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                display();
                break;
                case 2:
                    creation();
                    break;
                case 3:
                    return;
               
                case 4:
                    insbeg();
                    break;
                case 5:
                    insend();
                    break;
                case 6:
                    insany();
                    break;
                case 7:
                    deletebeg();
                    break;
                case 8:
                    delend();
                    break;
                    case 9:
                        delany();
                        break;

                    case 10:
                        reverse();
                        break;
                    case 11:
                        System.out.println(recusearch(10,start));
                        break;
                        case 12:
                            remfromlst();
                            break;        }
    }
    }
    public static void display(){
        if(start==null)
        {
            System.out.println("There is no node to print");
        }
        else{
            node p=start;
            while(p!=null)
            {
                System.out.println(p.data);
                p=p.next;
            }
        } 
    }
    public static void creation(){
        
        node q=null;
        char ch='y';
        while(ch=='y'){
            
            node p=new node();
            System.out.println("Enter the data");
            p.data=sc.nextInt();
            p.next=null;
            if(start==null){
                start=p;
                q=p;
            }
            else{
                q.next=p;
                q=p;
            }
                System.out.println("Do you want to create more node");
               ch = sc.next().charAt(0);
               
        }

    }

    public static void insbeg(){
        node p =new node();
        System.out.println("Enter data");
        p.data=sc.nextInt();
        p.next=start;
        start=p;        
    }
    public static void insend(){
        node p=new node();
        System.out.println("Enter info");
        p.data=sc.nextInt();
        p.next=null;
        if(start !=null)
        {
            node q=start;
            while(q.next!=null){
                q=q.next;
            }
            q.next=p;
        }
        else{
            start=p;
        }


    }
    public static void insany(){
        System.out.println("Enter the position to enter the element");
        int pos=sc.nextInt();
        node q=start;
        int count=0;
        while(q!=null)
        {
            q=q.next;
            count++;
        }
        if(pos>(count+1)){
            System.out.println("insertion not possible");
        }
        else{
        if(pos==1)
        {
            insbeg();
        }
        else if(pos==(count+1))
        {
            insend();
        }
        else{
            System.out.println("Enter data");
            node p=new node();
            p.data=sc.nextInt();
            q=start;
            int i=1;
            while(i<=(pos-2)){
                q=q.next;
                i++;
            }
             p.next=q.next;
             q.next=p;
        }
        }

    }
    
    public static void deletebeg(){
        if(start==null){
            System.out.println("nothing to delete");
        }
        else{
            node q =start;
            start=q.next;
            q.next=null;
            System.out.println("the deleted node is"+q.data);
        }
    }
    public static void delend(){
        if(start==null){
            System.out.println("nothing to delete");

        }
        else if(start.next==null){
            System.out.println("the deleted node is"+start.data);
            start=null;
        }
        else{
            node q=start;
            while(q.next.next!=null){
                q=q.next;
            }
            System.out.println("the deleted node is"+q.next.data);
            q.next=null;
            
        }
    }
    public static void delany(){
        if(start==null){
            System.out.println("Nothing to delete");
        }
        else{
            int count =0;
            node q=start;
            while(q!=null)
            {
                count++;
                q=q.next;
            }
            System.out.println("Enter the index of element to delete");
            int pos=sc.nextInt();
            if(pos>count){
                System.out.println("Not a valid position to delete");
            } 
            else{
                if(pos==1){
                    deletebeg();
                }
                else if(pos==count)
                {
                    delend();
                }
                else{
                    q=start;
                    int i=1;
                    while(i<=(pos-2)){
                        q=q.next;
                        i++;
                    }
                    node d=q.next;
                    q.next=d.next;
                    d.next=null;
                    System.out.println("The deleted node is "+d.data);

             }
            }  
        }
    }
    public static void reverse(){
        if(start==null){
            System.out.println("Linked list is empty");
        }
        else if(start.next==null){
        System.out.println("reverse not required");
        }
        else{

        node p=null,q=start,r=start.next;
        while(r!=null)
        {
            p=q;
            q=r;
            r=r.next;
            q.next=p;
             
        }
        start.next=null;
        start=q;
    }
    }
    public static boolean recusearch(int n,node p){
        if(p==null){
            return false;
        }
        if(p.data==n){
            return true;
        }
       return recusearch(n,p.next);
        
    }
    public static void remfromlst(){
        System.out.println("enter the n from last to delete");
        int n=sc.nextInt();
        int size=0;
        node q=start;
        while(q!=null)
        {
            size++;
            q=q.next;
        }
        int nn=size-n+1;
        int i=1;
        q=start;
    while(i<=(nn-2)){
        q=q.next;
        i++;
    }
    node r=q.next;
    System.out.println("The deleted node is "+r.data);
    q.next=r.next;
    }
}
