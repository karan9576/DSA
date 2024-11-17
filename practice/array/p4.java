
//trapping rain water
public class p4 {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int lh[]=new int[arr.length];
        int rh[]=new int[arr.length];
        int lmax=0;
        for(int i=0;i<arr.length;i++){
            if(lmax<arr[i]){
                lmax=arr[i];
            }
            lh[i]=lmax;
        }
        print(lh);
       int rmax=0;
        for(int i=arr.length-1;i>=0;i--){
            if(rmax<arr[i]){
                rmax=arr[i];
            }
            rh[i]=rmax;
        }
        print(rh);


        //calculating total water
        int tw[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            tw[i]=Math.min(lh[i],rh[i])-arr[i];
            sum+=tw[i];
        }
        System.out.println(sum);
    }

}
