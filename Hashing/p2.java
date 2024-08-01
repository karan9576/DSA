import java.util.*;
class p2{

    public static void majority(int num[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(hm.containsKey(num[i])){
                hm.put(num[i],hm.get(num[i])+1);
            }else{
                hm.put(num[i],1);
            }
            //the above if and else can be written in 1 line below
            //map.put(arr[i],map.getOrDefault(arr[i],0)+1); here 0 is the default value to fill when we dont find key
        }
        Set<Integer> keys=hm.keySet();  
        for(int i : keys){
            if(hm.get(i)>num.length/3){
                System.out.println(i);
            }
            //the above can be written as
            
        // for(int i : hm.keySet()){
        //     if(hm.get(i)>num.length/3){
        //         System.out.println(i);
        //     }
        }
    }
    public static void main(String args[]){
        int num[]={1,3,2,5,1,3,1,5,1};
        majority(num);
    }
}