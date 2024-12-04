package inherit;

  class box {
   double l;
   double w;
   double h;
     box()
     {
      this.w=1;
      this.h=1;
      this.l=1;
     }
     box(double v)
     {
       this.l=v;
       this.h=v;
       this.w=v;
     }
     box(double a,double b,double c)
     {
       this.l=a;
       this.h=b;
       this.w=c;
     }
     box(box old)
     {
      this.l=old.l;
      this.h=old.h;
      this.w=old.w;
     }
    static void show()
     {
      String shape="round";
      System.out.println("Showing "+shape);
     }
}
