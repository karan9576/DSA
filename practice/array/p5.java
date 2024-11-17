import java.util.*;
public class p5 {
   public static void main(String args[]){
    int []stk={7,1,5,3,6,4};
    //essentially in this question you need to track min buying price
    int bp=Integer.MAX_VALUE;
   int maxp=0;
       for(int i=0;i<stk.length;i++){
        if(stk[i]>bp){//today is the profit day
           int profit=stk[i]-bp;
           maxp=Math.max(profit,maxp);
        }
        else{//today stack price is less than buying price so update buying price
            bp=stk[i];
        }

    }
    System.out.println(maxp);


   } 
}
