//activity setion when array is not sorted according to end time
//here activities are sorted by start time

//T.C->O(nlogn)
import java.util.*;
class p2{
    public static void main(String []args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //sorting according to end time
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble( o->o[2]));
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        
        //1st Activity
        maxAct=1;
        ans.add(activities[0][0]);
        int endTime=activities[0][2];
        for(int i=1;i<start.length;i++){
            if(endTime<=activities[i][1]){
                ans.add(activities[i][0]);
                maxAct++;
                endTime=activities[i][2];
            }
        }
        System.out.println(maxAct);
        System.out.println(ans);
    }
}