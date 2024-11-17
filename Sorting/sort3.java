public class sort3 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int par=partition(arr,si,ei);   
        quickSort(arr,si,par-1);
        quickSort(arr, par+1, ei);

    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        int j;
        for(j=si;j<ei;j++){
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
            
        


        return i ;

    }
    public static void main(String []args){
        int arr[]={10,4,11,13,12};
        quickSort(arr,0,4);
        print(arr);
    }
}
