import java.util.*;
class p1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of lines you want to print");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //space
            for(int j=n-i-1;j>0;j--)
                System.out.print(" ");
            for(int k=0;k<=i;k++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}