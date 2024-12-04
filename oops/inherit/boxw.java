package inherit;

public class boxw extends box{
   double weight;
   
   boxw(double l,double w,double h,double wei)
   {
      super(l,w,h);
      this.weight=wei;
   }
   boxw(double h)
   {
      super(h);
       
   }
   static void show( )
   {
      System.out.println("Showing");
   }
}
 