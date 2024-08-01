//stock span problem;
import java.util.*;
class p7
{ 

    public static void main(String []args){
        int []stockprice={100,80,60,70,60,85,100};
        Stack<Integer> s= new Stack<>();
        s.push(0);

        int ans[]=new int[stockprice.length];
        ans[0]=1;
        for(int i=1;i<stockprice.length;i++)
        {
         while((!s.isEmpty() && stockprice[s.peek()]<=stockprice[i] ))
                s.pop();

                if(s.isEmpty())
                {
                    System.out.println("karan");
                    ans[i]=i+1;
                }
                else{
                ans[i]=i-s.peek();
                s.push(i);
            }
        }
                for(int i=0;i<ans.length;i++){
                        System.out.println(ans[i]+" ");
                }
            
              
        
            
        

       }
     }
