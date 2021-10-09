import java.lang.*;
class cylinder{
    private double radius;
    private double height;
    public cylinder()
    {
        radius=1;
        height=1;
    }
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
   public double getRadius()
   {
       return radius;
   }
   public double getHeight()
   {
       return height;
   }
   public void setRadius(double r)
   {
       if(r>=0)
       {
           radius=r;
       }
       else{
           radius=0;
       }
   }
   public void setHeight(double h)
   {
       if(h>=0)
       {
           height=h;
       }
       else{
           height=0;
       }
   }
   public double area()
   {
       return Math.PI*radius*radius;
   }
   public double volume()
   {
       return Math.PI*radius*radius*height;
   }
}
public class cylinder1{
    public static void main(String[] args)
    {
        cylinder c=new cylinder();
        c.setHeight(4.8);
        c.setRadius(4.4);
        System.out.println("Area is : "+c.area());
        System.out.println("Volume is : "+c.volume());
        
    }
}
