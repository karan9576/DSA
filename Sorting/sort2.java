public class sort2 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int []arr ,int si,int ei){
        if(si>=ei){
            return;
        }
            int mid=(si+ei)/2;
            mergeSort(arr,si,mid);
            mergeSort(arr,mid+1,ei);
            merge(arr,si,mid,ei);
      


    }

    public static void merge(int []arr,int si,int mi,int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mi+1,k=0;
        while(i<=mi && j<=ei){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                k++;
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
                k++;
            }
        }
        while(i<=mi){
            temp[k]=arr[i];
                i++;
                k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
                k++;
                j++;
        }
        //copy to main array
        for(k=0,i=si;i<=ei;i++,k++){
            arr[i]=temp[k];
        }
       
    }
    public static void main(String args[]){
        int arr[]={10,4,11,13,12};
        mergeSort(arr,0,4);
        print(arr);
    }
}
