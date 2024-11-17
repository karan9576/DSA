import java.util.*;
public class p1 {
    public static void main(String args[]){
        int a=785234767;
        int count=0;
        int temp=a;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=a;
        int i=count-1;
        int arr[]=new int[count];
        while(temp>0){
            int dig=temp%10;
            arr[i]=dig;
            i--;
            temp/=10;
        }
        int num=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(!al.contains(arr[j])){
                num=num*10+arr[j];
                al.add(arr[j]);
            }
        }
        System.out.println(num);
    

        
    }    
}
