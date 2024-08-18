import java.util.*;
class p8{
    public static void main(String args[]){
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());


        int h=0;//horizontal cut
        int v=0;//vertical cut
        int hp=1;//horizontal piecec count
        int vp=1;//vertical piecec count
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){
                cost+=(costHor[h]*vp);
                h++;
                hp++;
            }
            else{
               cost+=(costVer[v]*hp);
                v++;
                vp++;
        }
        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
                h++;
                hp++;
        }
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
                v++;
                vp++;
        }
        System.out.println("min cost of cut "+cost);

    }
    
}