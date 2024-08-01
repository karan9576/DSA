import java.util.*;
class p2{
    static class heap{
         ArrayList<Integer> arr=new ArrayList<>();
        public  void add(int data){
            arr.add(data);
            int childidx=arr.size()-1;
            int parentidx=(childidx-1)/2;
            while(arr.get(parentidx)>arr.get(childidx)){//FOR MAX HEAP USE <
                //swap
                int temp=arr.get(parentidx);
                arr.set(parentidx,arr.get(childidx));
                arr.set(childidx,temp);
                childidx=parentidx;
                parentidx=(childidx-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        //we are making heapify private because it should not be used by outside methods but rather than as helper function for its own class
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;//FOR MAX HEAP USE maxIdx and change variable accordingly

            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){ //FOR MAX HEAP USE <
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){ //FOR MAX HEAP USE <
                minIdx=right;
            }

            //swap minidx with i
            if(minIdx != i){
                int temp=arr.get(minIdx);
                arr.set(minIdx,arr.get(i));
                arr.set(i,temp);
            heapify(minIdx);
            }
        }


        public int remove(){
            int data=arr.get(0);
            //swap first and last element

            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //delete last element
            arr.remove(arr.size()-1);

            //fix
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
     }
    public static void main(String args[]){
        heap h=new heap();
        h.add(3);
        h.add(2);
        h.add(5);
        h.add(1);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
    }
}
}