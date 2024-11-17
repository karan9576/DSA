public class sort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}
        }
    }
    public static void selectionSort(int arr[]){
       for(int i=0;i<arr.length;i++){
        int small=i;
        for(int j=i+1;j<arr.length;j++){
              if(arr[j]<arr[small]){
                    small=j;
              }
              //temp
                int temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
        }
       }

    }
    public static void insertionSort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>curr ){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
    }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
            }
        int arrb[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            arrb[arr[i]]++;
        }
        int j=0;
        for(int k=0;k<arrb.length;k++){
            while(arrb[k]>0){
                 arr[j]=k;
                 arrb[k]--;
                 j++;   
            }
        }
        }
    
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        countingSort(arr);
        print(arr);

    }
}
