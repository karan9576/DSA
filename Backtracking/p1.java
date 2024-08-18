class p1{
    public static void changeArr(int arr[],int i,int val){
        //base cond
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //kaam
        arr[i]=val;
        //call inner func
        changeArr(arr,i+1,val+1);
        arr[i]-=2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printarr(arr);
    }
}