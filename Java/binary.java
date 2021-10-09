import java.lang.*;
import java.util.*;
class main{
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        if(str.matches("[01]*"))
        {
            System.out.println("Binary number");
        }
        else{
            System.out.println("Not a Binary number");
        }
    }
}
