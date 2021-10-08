import java.lang.*;
class main{
    public static void main(String[] args)
    {
        int n=153;
        int r;
        int m=n;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
            
        }
        if(m==sum)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
