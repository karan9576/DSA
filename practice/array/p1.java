//binary search
import java.util.*;
public class p1 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,4,5,6,7,8,9};
    int ele=5;
    int lo=0;
    int hi=arr.length;
    int flag=0;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]== ele){
            System.out.println("element found at index "+mid);
            flag=1;
            break;
        }
        else if(arr[mid]<ele){
            lo =mid+1;
        }
        else{
            hi=mid-1;
        }
    }
    if(flag==0){
        System.out.println("element not found");
    }
}    
}
