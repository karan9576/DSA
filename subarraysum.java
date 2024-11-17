public class subarraysum {
    public static void main(String args[]){
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int maxcurr=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            maxcurr+=arr[i];
            if(maxcurr<0){
                maxcurr=0;
            }
            if(maxcurr>max){
                max=maxcurr;
            }
        }
        System.out.println(maxcurr);
    }
 
}
