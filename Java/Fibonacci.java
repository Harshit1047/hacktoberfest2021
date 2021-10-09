import java.lang.*;
import java.util.*;
class recursion{
    static int fibonacci(int n)
    {
       if(n<0)
       {
           return -1;
       }
       else if(n==0 || n==1)
       {
           return n;
       }
       else{
           return fibonacci(n-1)+fibonacci(n-2);
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to calculate fibonacci");
        int num;
        num=sc.nextInt();
        System.out.println(fibonacci(num));
    }
}
