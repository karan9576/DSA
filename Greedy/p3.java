//fractional knapsack
import java.util.*;
class p3{
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        double W=50;

        double ratio[][]=new double[val.length][3];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]= weight[i];
            ratio[i][2]=val[i]/(double)weight[i];
                
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[2]));
        double value=0;
        for(int i=val.length-1;i>=0;i--){
            if(W>ratio[i][1]){
                W=W-ratio[i][1];
                value=value+ratio[i][2]*ratio[i][1];
            }
            else{
                value=value+ratio[i][2]*W;
                W=0;
                break;
            }
        }
        System.out.println(value);
    }
}