class p3{
    public static void findpermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length();i++){
           String Nstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(Nstr,ans+str.charAt(i));
        }
    }
    public static void main(String args[]){
        findpermutation("abc","");

    }
}