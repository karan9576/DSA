public class p3 {
    public static void main(String args[]){
        //maximum subarray
         int arr[]={-2,-3,4,-1,-2,1+};
         int csum=0;
         int maxsum=0;
         for(int i=0;i<arr.length;i++){
            csum+=arr[i];
            if(csum<0){
                csum=0;
            }
            if(csum>maxsum)
            {
                maxsum=csum;
            }
         }
         System.out.println(maxsum);
    }    
}
