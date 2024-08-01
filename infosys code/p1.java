import java.util.*;
class p1{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of monsters");
        int n=sc.nextInt();
        System.out.println("enter the initial no of experience points");
        int intexp=sc.nextInt();
        int power[]=new int[n];
        for(int i=0 ; i<n ; i++){
            power[i]=sc.nextInt();
        }
        
        int bonus[]=new int[n];
        for(int i=0 ; i<n  ; i++){
            bonus[i]=sc.nextInt();
        }
        class monster{
           private int power;
            private int bonus;
            monster(int power,int bonus){
                this.power=power;
                this.bonus=bonus;
            }
            
        }
        monster m[]=new monster[n];
        for(int i=0;i<n;i++)
        {
            m[i]=new monster(power[i],bonus[i]);
        }
        Arrays.sort(m,Comparator.comparingInt(monster->monster.power));
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(m[i].power<=intexp){
            intexp+=m[i].bonus;
            count++;
            }
            else{
            break;
        }
        }
        System.out.println(count);
        
    }
}