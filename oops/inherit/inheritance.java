package inherit;

public class inheritance {
    public static void main(String[] args) {
        box box1=new box();
        box box2=new box(box1);
        boxw box3=new boxw(4);

      //   System.out.println(box3.l);
      //   System.out.println(box3.w);
        System.out.println(box3.h);
      //   System.out.println(box3.weight);
      
    }
   }
 
 
