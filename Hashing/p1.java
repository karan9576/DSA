import java.util.*;
class p1{
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"India");
        hm.put(2,"USA");
        hm.put(3,"China");
        Set<Integer> keys=hm.keySet();
        for(Integer k : keys){
            System.out.println(k+"-->"+hm.get(k));
        }
    }
}