import java.util.*;
class p4{
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr1){
            hs.add(i);
        }
        for(int i:arr2){
            hs.add(i);
        }
        System.out.println("no.of union elemets"+hs.size());

        //intersection
        hs.clear();
        for(int i:arr1){
            hs.add(i);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
               if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
               } 
        }
        System.out.println("no 0f intersection elements ="+count);
    }
}