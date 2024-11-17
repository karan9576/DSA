public class p2 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        print(arr);
    }
}
