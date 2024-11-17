
public class bubble {
    public static void main(String args[]){
        int val=10;
        int arr[]={1,2,3,4,5,10};
        int ll=0;
        int ul=arr.length-1;
        while(ll<=ul){
           int mid=(ll+ul)/2;
            if(val==arr[mid]){
                System.out.println("found at the index"+mid);
                break;
            }
            else if(val>mid)
            {
                ll=mid+1;
            }
            else{
                ul=mid-1;
            }
            System.out.println(mid);
        }
    }
}
