public class sorting {

    public static void Bubblesort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void Selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            //swap
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

    }

    public static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
    }


    public static void mergesort(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    
    }
    public static void merge(int []arr,int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
                i++;
                k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
                k++;
                j++;
        }
        for(int m=si,l=0;l<temp.length;m++,l++){
            arr[m]=temp[l];
        }
    }
    public static void print(int[] var0) {
        for(int var1 = 0; var1 < var0.length; ++var1) {
           System.out.print(var0[var1] + " ");
        }
  
     }

     public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int par=partition(arr, si, ei);
        QuickSort(arr, si, par-1);
        QuickSort(arr, par+1, ei);
        
     }
     public static int partition(int arr[] ,int si, int ei){
        int pivot=arr[ei];
        int i=si-1;
        int j;
        for(j=si;j<ei;j++){//j should be less than pivot
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
              //placing pivot at position
              i++;
              int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
       
        return i;//returning position of pivot
     }
    public static void main(String args[]){
        int arr[]={10,9,8};
        QuickSort(arr,0,arr.length-1);
        print(arr);
    }
}
