//kadanes algo for max subarray
public class p2 {
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1};
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
            
        }
        System.out.println(ms);
    }
}
