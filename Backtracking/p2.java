class p2
{
    public static void subset(String str,String ans,int i){
        //base case
         if(i==str.length()){
            System.out.println(ans);
            return;
         }   
        //recursion(kaam)
        //yes choice
        subset(str,ans+str.charAt(i),i+1);
        //no choice
        subset(str,ans,i+1);
    }

    public static void main(String []args){
        subset("abc","",0);
    }
}