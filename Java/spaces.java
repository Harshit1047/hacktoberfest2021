import java.lang.*;
import java.util.*;
class main{
    public static void main(String[] args)
    {
      String str=" aa bb    sasda    acac   ds     ";
      String str1=str.replaceAll("\\s+"," ");
      System.out.println(str1);
    }
}
