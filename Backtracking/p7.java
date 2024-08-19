class p7{
    public static int gridways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){//condition for last cxell
            return 1;//because to go from n-1,m-1 to n-1,m-1 there is 1 way
        }
        else if(i==n || j==m){//boundary cross condition    
            return 0;
        }
        int w1=gridways(i+1,j,n,m);
        int w2=gridways(i,j+1,n,m);
        return (w1+w2);
    }
    public static void main(String args[]){
        int n=3, m=3;
    
        System.out.println(gridways(0,0,n,m));
    }
}