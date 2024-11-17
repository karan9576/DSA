public class hello {
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int max=arr[0];
        int lm[]=new int[arr.length];
        lm[0]=max;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            lm[i]=max;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(lm[i]);
        }
    }

}
