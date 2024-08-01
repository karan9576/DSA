//reverse a string using stack
import java.util.*;
class p5
{       
    public static void main(String []args){
        String st="karan";
        Stack<String> s= new Stack<>();
        for(int i=0;i<st.length();i++){
        s.push(""+st.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        while(!s.isEmpty()){
            str.append(s.pop());
        }
        String result=str.toString();
        System.out.println(result);
     }
    
}