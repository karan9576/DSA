import java.util.*;
class p3{
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(size>left &&arr[left]>arr[maxIdx])
        maxIdx=left;

        if(size>right &&arr[right]>arr[maxIdx])
        maxIdx=right;
        
        if(i!=maxIdx){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr,maxIdx,size);
        }


    }
    public static void heapSort(int arr[]){
        //step 1 build max heap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //step-2 push largest element at end
        for(int i=n-1;i>0;i--){
            //swap last and first
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr,0,i);//since heap size will be eaqual to i(each time the size of heap decreases)
        }
    }


    public static void main(String args[]){
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for(int i :arr){
            System.out.println(i);
        }
            }
}