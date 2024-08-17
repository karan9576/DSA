import java.util.*;

public class p6 {
    public static void main(String args[]){
        Integer []coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while(amount>=coins[i]){
                    amount-=coins[i];
                    count++;
                    ans.add(coins[i]);
                }
            }

        }
        System.out.println(count);
        System.out.println(ans);
    }
}
