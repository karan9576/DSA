//binary search
import java.util.*;
class p1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the eleemnets of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find in array");
        int ele=sc.nextInt();
        //binary search
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]==ele){
                System.out.println("element found"+mid);
                return;
            }
            else if(ele>arr[mid]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }

        }
        System.out.println("element not found");
    }
}