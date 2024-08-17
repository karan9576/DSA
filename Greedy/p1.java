//activity setion when array is sorted according to end time
import java.util.*;
class p1{
    public static void main(String []args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //array is already sorted by end time

        //but if not sorted according to end time then
    
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        
        //1st Activity
        maxAct=1;
        ans.add(0);
        int endTime=end[0];
        for(int i=1;i<start.length;i++){
            if(endTime<=start[i]){
                ans.add(i);
                maxAct++;
                endTime=end[i];
            }
        }
        System.out.println(maxAct);
        System.out.println(ans);
    }
}